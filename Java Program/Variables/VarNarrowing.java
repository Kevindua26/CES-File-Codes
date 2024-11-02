public class VarNarrowing{  
public static void main(String[] args){  
float fvalue=10.5f;  
//int intvalue=fvalue;//Compile time error  

int intvalue=(int)fvalue;
float testinttofloat=intvalue;
  
System.out.println("The floating value is "+fvalue);  
System.out.println("The Intergral value is "+intvalue);
System.out.println("The inttofloat value is "+testinttofloat);
 
}}  
