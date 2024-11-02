class TestInstance
{
public int inst=100;//instance variable
}

public class VariableDemo 
{  
    
    static int m=100;//static variable  
    void testmethod()  
    {    
        int n=90;//local variable
	System.out.println("localvariable in testmethod "+n);    
    }  
    public static void main(String args[])  
    {  
        
	//System.out.println("localvariable"+n);
	System.out.println("Static Variable"+m);
	TestInstance ti=new TestInstance();

	System.out.println("Instance Variable"+ti.inst);


    }  
}//end of class   
