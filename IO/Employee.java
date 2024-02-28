import java.io.*;
import java.util.*;
public class Employee implements Serializable
{
String name;
Date d=new Date();
String department;
String destination;
double salary;
Employee(String name,Date d,String dept,String dest,double sal)
{
name=name;
date=d;
department=dept;
destination=dest;
salary=sal;
}
}
public static void main(String args[])
{
Employee e=new Employee("ram",Tue Jul 12 18:35:37 IST 2023,"IT","Guntur",12354.89);
String f="helloworld.txt";
try
{
FileOutputStream fo=new FileOutputStream(f);
ObjectOutputStream o=new ObjectOutputStream(fo);
o.writeObject(e);
o.close();
fo.close();
System.out.println("deserialization successfull");
}
catch(Exception e)
{
}
Employee emp=null;
try
{
FileInputStream fi=new FileInputStream(f);
ObjectInputStream oi=new ObjectInputStream(fi);
emp=oi.readObject();
System.out.println("name:"+emp.name+" Date:"+emp.date+" department: "+department+"destination :"+emp.destination+" Salary:"+emp.salary);
System.out.println("deserialization successfull");
oi.close();
fi.close();
}
catch(Exception e)
{
}
}
}
}
