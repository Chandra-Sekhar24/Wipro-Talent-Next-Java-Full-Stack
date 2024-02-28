class MyException extends Exception
{
InvalidCountryException(String s)
{
super(s);
}
}
public class E5
{
public static void main(String args[])
{
try
{
String user=args[0];
int age=Integer.parseInt(args[1]);
if(age<18 || age>=60)
{
throw new MyException("inavlid age");
}
else
{
System.out.println("user is valid");
}
}
catch(InvalidCountryException e)
{
System.out.println(e);
}
}
}