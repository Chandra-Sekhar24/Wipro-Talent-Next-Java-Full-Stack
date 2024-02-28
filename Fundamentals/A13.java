public class A13
{
public static void main(String args[])
{
int n=args.length;
int r=0;
if(n%2==0)
{
system.out.println("enter the elements:");
int a[][]=new int[n/2][n/2];
int b[][]=new b[n/2][n/2];
for(int i=0;i<n/2;i++)
{
for(int j=0;j<n/2;j++)
{
a[i][j]=Integer.parseInt(args[r++]);
}
}
System.out.println("array after the reversing:");
for(int i=0;i<n/2;i++)
{
for(int j=0;j<n/2;j++)
{
b[i][j]=a[(n/2)-1-i][(n/2)-1-j];
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.println("enter the correct values");
}
}
}