import java.util.*;
class InvalidCountryException extends Exception
{
InvalidCountryException(String s)
{
super(s);
}
}
public class UserRegistration
{
public static void registerUser(String user,String country)
{
try
{
if(country.equalsIgnoreCase("India"))
{
System.out.println("user registration done successfull");
}
else
{
throw new InvalidCountryException("User outside the world cannot be allowed");
}
}
catch(InvalidCountryException e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the username and country name:");
String user=s.next();
String country=s.next();
registerUser(user,country);
}
}