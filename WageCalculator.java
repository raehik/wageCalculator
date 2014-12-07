/*
Does ZigZag even freaking **understand** OOP? This is a purely
procedural program! Graaaah!
 */

package wageCalculator;

public class WageCalculator {
	final double ADMIN = 7.43;
	final double PROG = 16.98;
	final double LEAD = 21.1;
	
	/**
	 * Ask for position, which is mapped to an hourly rate.
	 * @return	Hourly rate found.
	 */
	public double hourlyRateSelection() {
		// TODO: ask for input (A, P, L)
		return LEAD;
	}
	
	/**
	 * Ask for hours worked.
	 * @return	Hours worked.
	 */
	public int hoursWorked() {
		// TODO: use my +ve int function
		return 5;
	}
	
	public double calculateGross(double hours, double hourlyRate) {
		double gross = 0, rate1, rate2, rate3;
		if (hours <= 40) {
			gross = hours * hourlyRate;
		} else if (hours <= 50) {
			// mid-range overtime
			rate1 = 40 * hourlyRate;
			rate2 = (hours-40) * (hourlyRate * 1.5);
			gross = rate1 + rate2;
		} else if (hours > 50) {
			// high-paid overtime
			rate1 = 40 * hourlyRate;
			rate2 = 10 * (hourlyRate * 1.5);
			rate3 = (hours-50) * (hourlyRate * 2);
			gross = rate1 + rate2 + rate3;
		}
		return gross;
	}
	
	public double incomeTax(double gross) { return 0; }
}
