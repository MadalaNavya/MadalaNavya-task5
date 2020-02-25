package com.epam.app;

public class Cost {
	static float find_cost_house(int ch,float area)
	{
		if (ch==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(ch+3)*area;
		}
	
	}
}
