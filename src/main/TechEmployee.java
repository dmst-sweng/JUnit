package main;

class TechEmployee extends Employee {

    private int overtimeHours;
    private double rate;

    public TechEmployee(String n, double s, int o, double r) {
        super(n, s);
        overtimeHours = o;
        rate = r;
    }

    public void setOvertimeHours(int o) {
        overtimeHours = o;
    }

    public double printIncome() {
        return baseSalary + overtimeHours * rate;
    }
}

