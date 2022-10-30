package ua.khpi.oop.borusov07;

import java.util.List;

public class vacancies implements java.io.Serializable {
	
    
    private String name = null;
    private String company = null;
    private String WorkingСonditions = null;
    private int Earn;
    private List Terms;
    
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public String getWorkingСonditions() {
    	return WorkingСonditions;
    }
    public int getEarn() {
    	return Earn;
    }
    public List getTerms() {
        return Terms;
    }

    
    public void setName(final String value) {
        this.name = value;
    }

    public void setCompany(final String value) {
    	this.company = value;
    }
    public void setWorkingСonditions(final String value) {
    	this.WorkingСonditions = value;
    }
    public void setEarn(final int value) {
    	this.Earn = value;
    }
    public void setTerms(final List list) {
    	this.Terms = list;
    }
    
    @Override
    public String vacanies() {
    	return "Name: " + name  + "\ncompany: " + company + "\nWorking Сonditions " + WorkingСonditions + "\nEarn " + Earn;
    }
}

