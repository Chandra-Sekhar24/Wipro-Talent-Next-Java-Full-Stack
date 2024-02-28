import java.util.*;
public class A7
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
int c=1;
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
c++;
b[j]=-1;
}
}
if(b[i]!=-1)
{
b[i]=c;
}
}
System.out.println("array after deleting duplicates:");
for(int i=0;i<n;i++)
{
if(b[i]!=-1)
{
System.out.print(a[i]+" ");
}
}
}
}