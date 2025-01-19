// Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
package data_types;

public class DaysOfweek {
	public enum Days_Of_Week{
		SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY
	}
	public static void main(String[] args) {
		System.out.println(Days_Of_Week.MONDAY);
	}

}
