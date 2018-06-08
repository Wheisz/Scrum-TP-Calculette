package com.scrum.calculette;

import java.util.List;

public interface IOperation {

	/**
	 * Execute operation
	 * @return
	 * @throws Exception if
	 */
	float execute() throws Exception;
	int numberOfValues();
	
}
