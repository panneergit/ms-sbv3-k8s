package com.in28min.ms.sbv3.ces.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.sbv3.ces.dto.ExchangeValueDTO;
import com.in28min.ms.sbv3.ces.service.CurrencyExchnageService;

@RestController
@RequestMapping("/exchange-controller")
public class CurrencyExchnageController {

	@Autowired
	private CurrencyExchnageService exchnageService;

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeNote() {
		return ResponseEntity.ok("Welcome Currency Exchange Service");
	}

	@GetMapping("/exchangeinfos")
	public ResponseEntity<List<ExchangeValueDTO>> getAllCurrencyExchangeInfo() {
		return ResponseEntity.ok(exchnageService.getAllCurrencyExchangeInfo());
	}

	@GetMapping("/exchangeinfo/from/{from}/to/{to}")
	public ResponseEntity<ExchangeValueDTO> getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
		return ResponseEntity.ok(exchnageService.getCurrencyExchangeValue(from, to));
	}
}
