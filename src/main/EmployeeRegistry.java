package main;

class EmployeeRegistry {
    public static void main(String args[]) {
        Employee e = new Employee("John", 1250.50);
        TechEmployee te = new TechEmployee("Bob", 1400, 0, 10.5);
        AdminEmployee ae = new AdminEmployee("Alfred", 1500, 0);
        SecretaryEmployee se = new SecretaryEmployee("Anna",1100,3,30.5); 
        te.setOvertimeHours(9);
        ae.setBonus(500);
        System.out.println("Employee makes " + e.printIncome() + " Euros, TechEmployee makes " + te.printIncome() + " Euros, AdminEmployee makes " + ae.printIncome() + " Euros,");
        System.out.println("SecretaryEmployee makes " + se.printIncome() + " Euros");
    }
}

