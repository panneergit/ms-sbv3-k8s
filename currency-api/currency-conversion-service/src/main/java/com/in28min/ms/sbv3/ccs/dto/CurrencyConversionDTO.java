package com.in28min.ms.sbv3.ccs.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionDTO {
	private Long id;
	private String from;
	private String to;
	private BigDecimal exchangeValue;
	private BigDecimal quantity;
	private BigDecimal totalExchangeAmount;
	private String environment;
}
