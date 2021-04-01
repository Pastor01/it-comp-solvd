package com.solvd.itcomp.customExeptions;

public class SalaryZeroException extends Exception {
	public SalaryZeroException() {
		super("The salary number can't be zero");
	}
}