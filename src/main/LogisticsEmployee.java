package main;

public class LogisticsEmployee extends Employee { 

		private int hours;
		private double wagePerHour;
		private double bonusPerMonth;
		
		public LogisticsEmployee(String name, double salary, int whours, double wph, double bpm) {
			super(name, salary);
			hours = whours;
			wagePerHour = wph;
			bonusPerMonth = bpm;
		}
		
		public void setWorkingHours(int whours) {
			hours = whours;
		}
		
		public double printIncome() {
			return baseSalary + hours*wagePerHour+bonusPerMonth;
		}
		
		public double printIncomePerYear() {
			return (baseSalary + hours*wagePerHour+bonusPerMonth)*12;
		}
	
}
