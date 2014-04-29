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



	public String record()
	{


		if(meters/time>=10)
		evaluation="good";
		else
		evaluation="average";
		return evaluation;
	}



	public double totalRuning()
	{
		totalRun=totalRun+meters;

		return totalRun;
	}

}
