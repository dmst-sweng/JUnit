package main;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Arrays;

class EmployeeRegistry {
    public static void main(String args[]) {
    	DecimalFormat d = new DecimalFormat("0.00");
        Employee e = new Employee("John", 1250.50);
        TechEmployee te = new TechEmployee("Bob", 1400, 9, 10.5);
        AdminEmployee ae = new AdminEmployee("Alfred", 1500, 0, 7);
        SecretaryEmployee sep = new SecretaryEmployee("Anna", 1100, 3, 30.5);
        GreekEmployee gem = new GreekEmployee("Manolis", 426, "Master", 10, 3);
        MarketingEmployee me = new MarketingEmployee("Costas", 1100, 180, 15, 500);
        FinancialEmployee fe = new FinancialEmployee("Bill", 1000, 3, 85, 3, 15, 2, 10);
        WorkerEmployee we=new WorkerEmployee("Mathias",600,80,12);
        ae.setBonus(500);
        SalesEmployee se = new SalesEmployee("Mayra", 600.0, 7, 0.05f, 32000);
        ParentEmployee pe = new ParentEmployee("John Doe",3000, 2);
        List<String> languages = Arrays.asList("English", "German", "Greek");
        TranslationEmployee tre = new TranslationEmployee("Iason", 1500, 5, languages);
        HRDirector hr = new HRDirector("Maria Iliadi", 1050.00);
        AdministrationEmployee ade = new AdministrationEmployee("John Mak", 5000, 4);
        LogisticsEmployee le = new LogisticsEmployee("Helen", 1000, 178, 14, 700);
	BossEmployee be = new BossEmployee("Stelios" , 900, 180, 20, 200);
        
        System.out.println("Employee makes " + d.format(e.printIncome()) + " Euros"+ '\n'+ "TechEmployee makes " 
        + d.format(te.printIncome()) + " Euros"  + '\n'+ "AdminEmployee makes " + d.format(ae.printIncome()) + " Euros");
        System.out.println("SecretaryEmployee makes " + d.format(sep.printIncome()) + " Euros");
        System.out.println("GreekEmployee makes " + d.format(gem.printIncome()) + " Euros");
        System.out.println("MarketingEmployee makes " + d.format(me.printIncome()) + " Euros");
        System.out.println("FinancialEmployee makes " + d.format(fe.printIncome()) + " Euros");
        System.out.println("WorkerEmployee makes " + d.format(we.printIncome()) + " Euros");
        System.out.println(se.toString());
        System.out.println("ParentEmployee makes " + d.format(pe.printIncome()) + " Euros");
        System.out.println("A Translation Employee makes " + d.format(tre.printIncome()) + " Euros");
        System.out.println("HR Director, " + hr.name + ", makes " + d.format(hr.printIncome()) + " Euros");
        System.out.println("AdministrationEmployee with absenses makes " + d.format(ade.printIncome()) + " Euros");
        System.out.println("LogisticsEmployee makes " + d.format(le.printIncome()) + " Euros Per Month and "+ d.format(le.printIncomePerYear()) + " Euros Per Year");
	System.out.println("BossEmployee makes "+ d.format(be.printIncome()) + " Euros") ;
    }
}


