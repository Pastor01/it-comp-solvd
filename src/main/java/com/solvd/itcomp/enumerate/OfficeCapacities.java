package com.solvd.itcomp.enumerate;

public enum OfficeCapacities {
	
	HEAD_OF_DEP_THREE("Head of department Office", 3),
	CO_WORKING_SPACE_HUNDRED("Co-work Office", 100),
	MULTISPACE_TWENTY("Multi Space", 20),
	BOX_MEETING_FIVE("Meeting box", 5),
	REGULAR_OFFICE_TWENTYFIVE("Office", 25),
	BIG_OFFICE_FIFTY("Office", 50);
	
	
	private String name;
	private int capacity;
	
	
	private OfficeCapacities(String name, int capacity) {
		this.name=name;
		this.capacity=capacity;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getCapacity() {
		return this.capacity;
		
	}
	
}
