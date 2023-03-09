package Simple.Calculator;

public class CalculatorLogic
 {
	public static int addNo(int n1,int n2)//method for two number Addition
	{
		return n1+n2;
	}
    public static int subNo(int n1, int n2)//method for two number Subtraction
    {
    	return n1-n2;
    }
    public static int mulNo(int n1, int n2)//method for two number Multiplication
    {
    	return n1*n2;
    }public static int divNo(int n1, int n2)//method for two number Division
    {
    	try {
    	return n1/n2;
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return n2;
    	
    }
		
    
}
