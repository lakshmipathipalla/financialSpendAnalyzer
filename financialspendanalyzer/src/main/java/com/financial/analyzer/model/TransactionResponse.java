package com.financial.analyzer.model;

public class TransactionResponse {
	
	private TransactionResponseHeader transactionResponseHeader;
	
	private TransactionDetails transactionDetails;

	public TransactionResponseHeader getTransactionResponseHeader() {
		return transactionResponseHeader;
	}

	public void setTransactionResponseHeader(TransactionResponseHeader transactionResponseHeader) {
		this.transactionResponseHeader = transactionResponseHeader;
	}

	public TransactionDetails getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

}
