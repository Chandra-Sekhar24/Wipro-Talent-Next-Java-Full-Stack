import java.util.*;
public class F16
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int s=0;
while(n>0)
{
s=s*10+(n%10);
n=n/10;
}
System.out.println("reverse of the number is:"+s);
}
}