import java.util.*;
public class A5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("two largest numbers are:"+a[n-1]+" "+a[n-2]);
System.out.println("two smallest numbers are:"+a[0]+" "+a[1]);
}
}