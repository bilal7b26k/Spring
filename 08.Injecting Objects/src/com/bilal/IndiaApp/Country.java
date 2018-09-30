package com.bilal.IndiaApp;

public class Country {
	private States[] state;

	public States[] getState() {
		return state;
	}

	public void setState(States[] state) {
		this.state = state;
	}
	
	public void getDetails() {
		for(States st:state) {
			System.out.println(st.getCode());
			System.out.println(st.getName());
			System.out.println(st.getCapital());
		}
	}

}
