package com.arturpodchayev.banking_transaction_service;

import org.springframework.boot.SpringApplication;

public class TestBankingTransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BankingTransactionServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
