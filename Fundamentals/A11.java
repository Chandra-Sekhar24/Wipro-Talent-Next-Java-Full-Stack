import java.util.*;
public class A11
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int k=0;
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]==1 || a[i]==4)
{
k++;
}
}
if(k==n-1)
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}