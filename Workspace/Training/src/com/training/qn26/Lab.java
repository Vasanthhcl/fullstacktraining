package com.training.qn26;

public class Lab {
	
	private int labId;
	private int seatingCapacity;
		

	public Lab(int labId, int seatingCapacity) {
		super();
		this.labId = labId;
		this.seatingCapacity = seatingCapacity;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

}
