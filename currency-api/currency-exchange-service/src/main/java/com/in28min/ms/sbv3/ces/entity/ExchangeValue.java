package com.in28min.ms.sbv3.ces.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "exchange_value")
@Data
public class ExchangeValue {

	@Id
	private Long id;

	@Column(name = "ex_from")
	private String from;

	@Column(name = "ex_to")
	private String to;

	@Column(name = "ex_value")
	private BigDecimal exchangeValue;
}
