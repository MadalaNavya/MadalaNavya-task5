package com.epam.app;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App extends Intrest_Calculator
{
	Scanner scan=new Scanner(System.in);
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	void App()
	{
		LOGGER.info("Enter type of interest\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=scan.nextInt();
		if(type==1)
		{
			Simple_Interest();
		}
		else if(type==2)
		{
			Compound_Interest();
		}
		else {
			LOGGER.info("Choose a valid option.");
		}
	}
	void Simple_Interest()
	{
		LOGGER.info("Enter principal amount:");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of years:");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of Interest:");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void Compound_Interest()
	{
		LOGGER.info("Enter principal amount:");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of times to be calculated:");
		int times_to_calculate=scan.nextInt();
		LOGGER.info("Enter number of years:");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of interest:");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Compound interest is "+compound_interest(principal_amount,times_to_calculate,years,rate_of_interest));
	}

    public static void main( String[] args )
    {
    	App object_1=new App();
		object_1.App();
    }
}
