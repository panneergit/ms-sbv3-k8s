package com.in28min.ms.sbv3.ces.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.in28min.ms.sbv3.ces.dto.ExchangeValueDTO;
import com.in28min.ms.sbv3.ces.repo.CurrencyExchangeRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class CurrencyExchnageService {

	@Autowired
	private CurrencyExchangeRepository exchangeRepository;

	@Autowired
	private Environment env;

	public ExchangeValueDTO getCurrencyExchangeValue(String from, String to) {
		log.info("Currency Exchange Value from: {} to : {}", from, to);
		var exchangeObj = exchangeRepository.findByFromAndTo(from, to);
		var exchangeValueDTO = new ExchangeValueDTO();
		if(exchangeObj.isPresent()) {
			exchangeValueDTO.setId(exchangeObj.get().getId());
			exchangeValueDTO.setFrom(from);
			exchangeValueDTO.setTo(to);
			exchangeValueDTO.setExchangeValue(exchangeObj.get().getExchangeValue());
			exchangeValueDTO.setEnvironment("Application Version :: 0.0.1-SNAPSHOT "+"  Host Name:"+env.getProperty("HOSTNAME")+ " Port No::"+ env.getProperty("local.server.port"));
		} else {
			throw new RuntimeException("Unable to Find data for " + from + " to " + to);
		}
		return exchangeValueDTO;
	}
}
