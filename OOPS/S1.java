import java.util.*;
public class S1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
String str=s.next();
String str1="";
for(int i=str.length()-1;i>=0;i--)
{
str1+=str.substring(i,i+1);
}
if(str.equals(str1))
{
System.out.println("string is polindrom");
}
else
{
System.out.println("not a polindrom");
}
}
}