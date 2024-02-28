import java.util.*;
public class A10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int k=0;
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
b[k++]=a[i];
}
}
for(int i=0;i<n;i++)
{
if(a[i]%2!=0)
{
b[k++]=a[i];
}
}
System.out.println("array elements after the evenodd is:");
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}