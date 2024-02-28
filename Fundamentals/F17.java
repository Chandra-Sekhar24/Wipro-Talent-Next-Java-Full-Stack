import java.util.*;
public class F17
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int t=n;
int s=0;
while(n>0)
{
s=s*10+(n%10);
n=n/10;
}
if(t==s)
{
System.out.println("polindrom");
}
else
{
System.out.println("not polindrom");
}
}
}