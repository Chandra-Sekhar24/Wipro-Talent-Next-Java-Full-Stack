import java.util.*;
public class F14
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int c=0;
for(;n>0;)
{
  c+=(n%10);
  n/=10;
}
System.out.println("sum of the digits is:"+c);
}
}
}