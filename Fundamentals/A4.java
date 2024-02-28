import java.util.*;
public class A4
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
System.out.println("characters corrosponding ascii values is:");
for(int i=0;i<n;i++)
{
System.out.print((char)a[i]+" "+);
}
}
}