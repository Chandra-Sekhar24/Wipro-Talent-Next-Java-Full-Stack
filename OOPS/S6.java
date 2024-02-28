import java.util.*;
public class S6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
String str2=s.next();
String str3="";
if(str1.length()<str2.length())
{
str3=str1+str2+str1;
}
else
{
str3=str2+str1+str2;
}
System.out.println(str3);
}
}