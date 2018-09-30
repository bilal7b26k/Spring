package com.bilal.CollectionApp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Footballers {
	
	private String name;
	private List<Teams> team;
	private Set<Vehicles> vehicle;

	
	//	private Map<Object, Object>  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Teams> getTeam() {
		return team;
	}
	public void setTeam(List<Teams> team) {
		this.team = team;
	}
	public Set<Vehicles> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<Vehicles> vehicle) {
		this.vehicle = vehicle;
	}
	
	
	public void getDetails() {
		System.out.println("Player Name :");
		System.out.println("-------------------");
		System.out.println("Teams");
		System.out.println("--------------------");
		for(Teams tm:team) {
			System.out.println(tm.getName());
			System.out.println(tm.getNo());
			
		}
		System.out.println("-------------------");
		System.out.println("Vehicles");
		System.out.println("--------------------");
		for(Vehicles ve:vehicle) {
			System.out.println(ve.getName());
			System.out.println(ve.getNo());
			
		}
		
		
		
		
	}
	
	
	
	

}
