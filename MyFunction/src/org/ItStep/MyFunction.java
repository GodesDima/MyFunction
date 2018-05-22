package org.ItStep;

public class MyFunction {
	public int getMyFunction (int number) {
		 
		 MyFunction function = new MyFunction();
		 int Function = (number + 6) * function.getFactorial(number);
		 return function.getFactorial(Function);
		     
		 }
	


	   public int getFactorial(int number) {
	        int factorial = 2;
	        {
			for (int i = 2; i <= number; i++) {
				factorial = factorial * i;
			}
			return number;
			}
		 
	        
		}
	}

