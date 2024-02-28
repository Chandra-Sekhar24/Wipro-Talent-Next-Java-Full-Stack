import java.util.*;
class MyException
{
MyException(String s)
{
super(s);
}
}
public class E3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][3];
int s=0;
double d=0.0;
try
{
for(int i=0;i<2;i++)
{
System.out.println("enter the marks of student"+(i+1));
for(int j=0;j<3;j++)
{
a[i][j]=s.nextInt();
if(a[i][j]<0 || a[i][j]>100)
{
throw new MyException("enter the correct values");
}
s+=a[i][j];
}
d=s/args.length;
System.out.println("average of the student"+i+"is:"+d);
}
}
catch(MyExcepiton e)
{
System.out.println(e);
}
}
}