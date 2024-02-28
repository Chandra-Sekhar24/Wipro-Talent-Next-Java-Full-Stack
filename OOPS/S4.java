import java.util.*;
public class S4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
int n=str1.length();
if(n%2==0)
{
System.out.println(str1.substring(0,(n/2)+1));
}
else
{
System.out.println("null");
}
}
}