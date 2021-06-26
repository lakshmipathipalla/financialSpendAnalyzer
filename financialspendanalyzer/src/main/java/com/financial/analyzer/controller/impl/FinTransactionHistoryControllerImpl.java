package com.financial.analyzer.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.financial.analyzer.controller.IFinTransactionHistoryController;
import com.financial.analyzer.exceptions.CustomerIdRequiredException;
import com.financial.analyzer.exceptions.InvalidInputException;
import com.financial.analyzer.model.TransactionResponse;

public class FinTransactionHistoryControllerImpl implements IFinTransactionHistoryController {

	@Override
	public ResponseEntity<TransactionResponse> getPetById(String customerId) {
		
		if(customerId == null) {
			throw new CustomerIdRequiredException();
		}else if(!customerId.matches("\\d+")) {
			throw new InvalidInputException();
		}
		return new ResponseEntity<TransactionResponse>(new TransactionResponse(), HttpStatus.OK);
	}

}
