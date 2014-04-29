package main;

public class Trainer {
	
	
	double meters;
	double time;
	String evaluation;
	double totalRun=0;


	 public Trainer(double m, double t) {
	     this.meters = m ;
	     this.time = t ;

	   }



	public String record(double meters,double time)
	{


		if(meters/time>=10)
		evaluation="good";
		else
		evaluation="average";
		return evaluation;
	}



	public double TotalRuning(double meters)
	{
		totalRun=totalRun+meters;

		return totalRun;
	}

}
