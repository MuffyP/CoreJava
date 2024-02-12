package com.edubridge.abstractclassdemo;

abstract public class GovernmentAgency {

	private String agencyName;
	private long yearlyBudget;
	
	
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getYearlyBudget() {
		return yearlyBudget;
	}
	public void setYearlyBudget(long yearlyBudget) {
		this.yearlyBudget = yearlyBudget;
	}
	abstract void displayDeatils();
	
	abstract void displayDeatils(String agencyName,long yearlyBudget);
	
	String display(){
		return "Concrete Method";
	}
	@Override
	public String toString() {
		return "GovernmentAgency [agencyName=" + agencyName + ", yearlyBudget=" + yearlyBudget + "]";
	}
	
}
