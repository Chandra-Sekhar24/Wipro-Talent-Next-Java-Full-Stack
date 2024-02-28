import java.util.*;
public class Calculator
{
public static double powerInt(int a,int b)
{
return(Math.pow((double)a,(double)b));
}
public static double powerDouble(double a,double b)
{
return(Math.pow(a,b));
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter int the numbers:");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("enter the double values:");
double c=s.nextDouble();
double d=s.nextDouble();
System.out.println("power for int values is:"+powerInt(a,b)+" power for double values:"+powerDouble(c,d));
}
}