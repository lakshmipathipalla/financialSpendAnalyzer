package com.financial.analyzer.service.impl;

import org.springframework.stereotype.Service;

import com.financial.analyzer.model.TransactionResponse;
import com.financial.analyzer.repository.ITransactionDetailDao;
import com.financial.analyzer.repository.impl.TransactionDetailDao;
import com.financial.analyzer.repository.impl.TransactionDetailDaoImpl;
import com.financial.analyzer.service.ITransactionDetailService;

@Service
public class TransactionDetailServiceImpl implements ITransactionDetailService {

	private ITransactionDetailDao transactionDetailDao;
	
	@Override
	public TransactionResponse getTransactionResponse() {
		return null;
	}

}
