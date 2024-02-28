import java.util.*;
public class A3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int f=0,index=-1;
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the search element:");
int s=s.nextInt();
for(int i=0;i<n;i++)
{
if(s==a[i])
{
f=1;
index=i;
break;
}
}
if(f!=-1)
{
System.out.println("search element at:"+index);
}
else
{
System.out.println(index);
}
}
}