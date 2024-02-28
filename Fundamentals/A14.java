public class A14
{
public static void main(String args[])
{
int n=args.length;
int max=Integer.parseInt(args[0]);
if(n==9)
{
system.out.println("enter the elements:");
int a[][]=new int[3][3];
int r=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[r++]);
if(max<a[i][j])
{
max=a[i][j];
}
}
}
System.out.println("the array is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("maximum element is:"+max);
}
else
{
System.out.println("enter the 9 values");
}
}
}