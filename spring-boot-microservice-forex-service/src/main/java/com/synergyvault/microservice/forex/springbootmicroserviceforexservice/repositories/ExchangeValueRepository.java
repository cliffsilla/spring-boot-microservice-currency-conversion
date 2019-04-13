package com.synergyvault.microservice.forex.springbootmicroserviceforexservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergyvault.microservice.forex.springbootmicroserviceforexservice.entities.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}