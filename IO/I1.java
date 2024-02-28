import java.io.*;
import java.util.*;
public class I1
{
public static void main(String args[])throws Exception
{
Scanner s=new Scanner(System.in);
System.out.println("enter the file name:");
String str=s.next();
File f=new File(str);
FileInputStream fi=new FileInputStream(f);
System.out.println("enter the character to be counted:");
char c=s.next().charAt(0);
int count=0;
while((fi.read())!=-1)
{
if(fi.read()==(int)c)
{
count++;
}
}
System.out.println("File"+str+"has "+count+"instances of "+c);
}
}