/*
 * ONLY the method transactionFee
 * 
 * Solution for:
 * https://practiceit.cs.washington.edu/problem/view/bjp4/chapter8/e11-transactionFeeBankAccount
 * 
 * Created by: Matheus Vazzoler
 * Date: 12/02/2019
 */

public boolean transactionFee(double fee) {
    	double totalFees = 0;
    	for (int i = 1; i <= transactions; i++) {
    		totalFees += fee * i;
    	}
    	
    	if( balance <=  totalFees ) {
    		balance = 0.00;
    		return false;
    	} else {
    		balance = balance - totalFees;
    		return true;
    	}
    }
