package com.financial.analyzer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financial.analyzer.model.TransactionResponse;

@RestController
public interface IFinTransactionHistoryController {
	
	@RequestMapping(value = "/pet/{customerId}",
	        produces = { "application/json"}, 
	        method = RequestMethod.GET)
	    ResponseEntity<TransactionResponse> getPetById(@PathVariable("customerId") String petId);

}
