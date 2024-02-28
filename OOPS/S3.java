import java.util.*;
public class S3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
String str3="";
for(int i=0;i<str1.length();i++)
{
str3+=str1.substring(0,3);
}
System.out.println(str3);
}
}