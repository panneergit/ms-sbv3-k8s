package com.in28min.ms.sbv3.ces.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.ms.sbv3.ces.entity.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {

	public Optional<ExchangeValue> findByFromAndTo(String from, String to);

}
