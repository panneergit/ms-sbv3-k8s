package com.in28min.ms.sbv3.ccs.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28min.ms.sbv3.ccs.dto.CurrencyConversionDTO;

//@FeignClient(name = "exchange-service", url = "http://localhost:8081")
@FeignClient(name = "exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/exchange-service/exchange-controller/exchangeinfo/from/{from}/to/{to}")
	public CurrencyConversionDTO getCurrencyExchnageValue(@PathVariable String from, @PathVariable String to);

}
