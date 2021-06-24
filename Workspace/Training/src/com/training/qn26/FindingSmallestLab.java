package com.training.qn26;

public class FindingSmallestLab {

	public static Lab minimumFinder(Lab[] obj) {

		Lab minimunValue;

		if ((obj[0].getSeatingCapacity() < obj[1].getSeatingCapacity())
				&& (obj[0].getSeatingCapacity() < obj[2].getSeatingCapacity())) {

			minimunValue = obj[0];
		} else if (obj[1].getSeatingCapacity() < obj[2].getSeatingCapacity()) {

			minimunValue = obj[1];
		} else {
			minimunValue = obj[2];
		}
		return minimunValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab lab1 = new Lab(1, 30);
		Lab lab2 = new Lab(2, 40);
		Lab lab3 = new Lab(3, 20);

		Lab[] objArray = { lab1, lab2, lab3 };

		Lab minCapacity = minimumFinder(objArray);

		System.out.println(" Lab Id " + minCapacity.getLabId() + " has the minimum capacity with number of seats as: "
				+ minCapacity.getSeatingCapacity());
	}

}
