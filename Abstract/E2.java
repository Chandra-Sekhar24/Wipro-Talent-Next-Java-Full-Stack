public class E2
{
public static void main(String args[])
{
int a[]=new int[args.length];
int s=0;
double d=0.0;
for(int i=0;i<args.length;i++)
{
a[i]=Integer.parseInt(args[i]);
s+=a[i];
}
d=s/args.length;
try
{
System.out.println("sum of the array elements is:"+s);
System.out.println("average of the array elements is:"+d);
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