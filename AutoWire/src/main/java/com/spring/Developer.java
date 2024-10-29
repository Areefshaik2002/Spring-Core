package com.spring;

public class Developer {
	private Computer computer; 
	
	public Developer() {}
	
	public Developer(Computer computer) {
		super();
		this.computer = computer;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void startCoding() {
		computer.Code();
	}
	
}
