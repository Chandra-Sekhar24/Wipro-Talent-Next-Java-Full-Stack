import java.util.*;
public class A9
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
if(a[i]!=10)
{
b[i]=a[i];
k++;
}
}
while(k<n)
{
b[k++]=0;
}
System.out.println("after removing the 10's elements is:");
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}