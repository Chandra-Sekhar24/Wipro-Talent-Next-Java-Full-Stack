import java.io.*;
import java.util.*;
public class I2
{
public static void main(String args[])throws Exception
{
Scanner s=new Scanner(System.in);
System.out.println("enter the input file name:");
String str=s.next();
System.out.println("enter the output file name:");
String str1=s.next();
File f=new File(str);
FileInputStream fi=new FileInputStream(f);
File f1=new File(str);
FileOutputStream fi1=new FileOutputStream(f1);
int c=fi.read();
while(c!=-1)
{
fi1.write((char)c);
c=fi.read();
}
System.out.println("file copied successfully");
}
}