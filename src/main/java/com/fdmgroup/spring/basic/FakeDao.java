package com.fdmgroup.spring.basic;

public class FakeDao {
	private FakeEmf emf;

	public FakeDao(FakeEmf emf) {
		super();
		this.emf = emf;
	}

	public FakeDao() {
		super();
	}



	public FakeEmf getEmf() {
		return emf;
	}

	public void setEmf(FakeEmf emf) {
		this.emf = emf;
	}

	@Override
	public String toString() {
		return "FakeDao [emf=" + emf + "]\t" + hashCode();
	}
	
	
}
