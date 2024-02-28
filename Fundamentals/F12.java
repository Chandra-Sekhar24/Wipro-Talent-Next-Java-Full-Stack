import java.util.*;
public class F12
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers:");
int n1=s.nextInt();
int n2=s.nextInt();
if(n1%10==n2%10)
  System.out.println("true");
else
  System.out.println("false");
}
}