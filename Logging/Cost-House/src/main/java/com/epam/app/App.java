package com.epam.app;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App extends Cost {
    Scanner s=new Scanner(System.in);
    @SuppressWarnings("resource")
    private static final Logger LOGGER = LogManager.getLogger(App.class);
	static void App()
	{
		Scanner scan=new Scanner(System.in);
		LOGGER.info("Enter area of site in square feet");
		float area=scan.nextFloat();
		LOGGER.info("Enter the choice: fully automated home\n1.YES\n2.NO");
		int choice=scan.nextInt();
		if (choice==1)
		{
			LOGGER.info("Cost for the construction of house: "+find_cost_house(4,area));
		}
		else if(choice==2)
		{
			LOGGER.info("Select the type of material use to built your house:\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int choice1=scan.nextInt();
			if (choice1<1 && choice1>3)
			{
				LOGGER.info("Select a valid option...!");
			}
			else
			{
				LOGGER.info("cost for the construction of house: "+find_cost_house(choice1,area));
			}
		}
		else
		{
			LOGGER.info("Select a valid option...!");
		}
	}
    public static void main( String[] args )
    {
    	App obj1=new App();
  		obj1.App();
    }
}
