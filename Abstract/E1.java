import java.util.*;
public class E1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements in the array:");
int n=s.nextInt();
System.out.println("enter the array elements:");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the index of element that you want:");
int index=s.nextInt();
try
{
System.out.println("the array element at index "+index+"="+a[index]);
System.out.println("array element accessed successfully");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
}