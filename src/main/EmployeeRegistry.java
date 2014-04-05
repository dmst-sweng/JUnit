package main;

class EmployeeRegistry {
    public static void main(String args[]) {
        Employee e = new Employee("John", 1250.50);
        TechEmployee te = new TechEmployee("Bob", 1400, 9, 10.5);
        AdminEmployee ae = new AdminEmployee("Alfred", 1500, 0);
        SecretaryEmployee sep = new SecretaryEmployee("Anna", 1100, 3, 30.5);
        GreekEmployee gem = new GreekEmployee("Manolis", 426, "Master", 10, 3);
        ae.setBonus(500);
        SalesEmployee se = new SalesEmployee("Mayra", 600, 7, 0.5f, 32000);
        System.out.println("Employee makes " + e.printIncome() + " Euros, TechEmployee makes " + te.printIncome() + " Euros, AdminEmployee makes " + ae.printIncome() + " Euros,");
        System.out.println("SecretaryEmployee makes " + sep.printIncome() + " Euros");
        System.out.println("GreekEmployee makes " + gem.printIncome() + " Euros");
        System.out.println(se.toString());
    }
}

