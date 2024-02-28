import java.util.*;
public class S8
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
String str1=s.next();
for(int i=0;i<str1.length();i++)
{
if(str1.charAt(i)=='*')
{
System.out.println(str1.substring(0,i-1)+str1.substring(i+2,str1.length());
break;
}
}
}
}