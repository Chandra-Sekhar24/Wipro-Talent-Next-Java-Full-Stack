import java.util.*;
public class S5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
int n=str1.length();
System.out.println(str1.substring(1,n-1));
}
}