import java.util.*;
public class F11
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int n=s.nextInt();
if(n>0)
  System.out.println("positive");
else if(n<0)
  System.out.println("negative");
else
  System.out.println("zero");
}
}