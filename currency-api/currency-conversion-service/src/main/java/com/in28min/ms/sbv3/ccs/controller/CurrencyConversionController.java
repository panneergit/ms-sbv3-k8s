package com.in28min.ms.sbv3.ccs.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.sbv3.ccs.client.service.CurrencyExchangeProxy;
import com.in28min.ms.sbv3.ccs.dto.CurrencyConversionDTO;

@RestController
@RequestMapping("/conversion-controller")
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeNote() {
		return ResponseEntity.ok("Welcome Currency Conversion Service");
	}
	
	@GetMapping("/conversioninfo/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversionDTO> getCurrenctConversionInfo(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

		var currencyConversionObj = proxy.getCurrencyExchnageValue(from, to);

		if(currencyConversionObj != null) {
			currencyConversionObj.setQuantity(quantity);
			currencyConversionObj.setTotalExchangeAmount(currencyConversionObj.getExchangeValue().multiply(quantity));
			currencyConversionObj.setEnvironment(currencyConversionObj.getEnvironment());
		}

		return ResponseEntity.ok(currencyConversionObj);
	}
 
}
