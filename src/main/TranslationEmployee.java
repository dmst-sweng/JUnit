package main;

import java.util.List;


public class TranslationEmployee  extends Employee {
	
	private double income;
	List<String> lang;
	public int lang_num;
	
	 public TranslationEmployee (String n, double s, int ssn, List<String> l) {
	 super(n, s);	
	  lang = l;
	  lang_num = l.size();
	 }
	  
	 
		 public double printIncome() {
			if (lang_num == 2){    
				for (int i = 1; i<= lang_num; i++){
					String str = (String) lang.get(i-1);				
					if(str == "German") income = baseSalary + 300;
				}
			}
			else if (lang_num == 3){
				for (int i = 1; i<= lang_num; i++){
					String str = (String) lang.get(i-1);				
					if(str == "German") income = baseSalary + 600;
					
				}
			}
			else if (lang_num > 3) income = baseSalary+ 900;
			else income = baseSalary;
			
			return income;
		
		 }
		 
			

}