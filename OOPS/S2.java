import java.util.*;
public class S2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
String str2=s.next();
String str3=str1.toLowerCase()+str2.toLowerCase();
System.out.println(str3);
}
}