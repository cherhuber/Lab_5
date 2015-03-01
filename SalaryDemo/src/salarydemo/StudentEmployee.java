package salarydemo;

import test.salarydemo.*;

/**
 * An hourly employee is paid for every hour worked.
 */
public class StudentEmployee extends Employee {

	private double hourlyWage;
	private double federalContribution = 0.5;

	/**
	 * Constructs an hourly employee with a given name and weekly wage.
	 * @param name the name of this employee
	 * @param wage the hourly wage
	 */
	public void HourlyEmployee(String name, double wage) {
		// TODO - implement StudentEmployee.HourlyEmployee
		//throw new UnsupportedOperationException();
		setName(name);
      hourlyWage = wage;
	}

	/**
	 * 
	 * @param hoursWorked
	 */
	public double weeklyPay(int hoursWorked) {
		// TODO - implement StudentEmployee.weeklyPay
		//throw new UnsupportedOperationException();
		double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         // Add overtime
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
	}
	public double getFedContribution(int hoursWorked){
		double pay = weeklyPay(hoursWorked);
		double fedPay = pay * federalContribution;
		return fedPay;
      }

	}

}