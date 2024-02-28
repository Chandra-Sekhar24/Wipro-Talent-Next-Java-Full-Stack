import java.util.*;
public class A8
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int s=0,i=0;
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
while(i<n)
{
int j=i+1;
while(j<n)
{
if(a[i]==(a[j]+1))
{
j+=1;
i=j+1;
}
}
s+=a[i];
}
System.out.println("sum after removing the successive elements is:"+s);
}
}