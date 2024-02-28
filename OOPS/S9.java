import java.util.*;
public class S9
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the strings:");
String str1=s.next();
String str2=s.next();
String str3="";
int i;
for(i=0;i<str1.length();i++)
{
str3+=str1.substring(i,i+1)+str2.substring(i,i+1);
}
if(str1.length()<str2.length())
{
str3+=str2.substring(i,str2.length());
}
if(str1.length()>str2.length())
{
str3+=str1.substring(i,str1.length());
}
System.out.println(str3);
}
}