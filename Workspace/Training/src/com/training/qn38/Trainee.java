package com.training.qn38;

public class Trainee {
	
	private static final String BATCH_CODE = "CHNFSD";
	private int employeeId;
	private String Name;
	
	public Trainee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		Name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public static String getBatchCode() {
		return BATCH_CODE;
	}

	
	public String display() {
		return "Trainee [employeeId=" + employeeId + ", Name=" + Name + "],[BATCH_CODE=" + BATCH_CODE + "]";
	}
	
	

}
