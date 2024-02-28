import java.util.*;
public class A2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int max,min;
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
max=a[0],min=a[0];
for(int i=1;i<n;i++)
{
if(max<a[i])
   max=a[i];
if(min>a[i])
   min=a[i];
}
System.out.println("minimum of the array elements is:"+min);
System.out.println("maximum of the array elements is:"+max);
}
}