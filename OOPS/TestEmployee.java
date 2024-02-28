public class Person
{
String name;
Person(String s)
{
name=s;
}
public void setName(String s)
{
name=s;
}
public String getName()
{
return name;
}
}
public class Employee extends Person
{
String name;
double salary;
int year;
String insnum;
Employee(String s,double d,int y,String in)
{
name=s;
salary=d;
year=y;
insnum=in;
}
public void setDetails(String s,double d,int y,String in)
{
name=s;
salary=d;
year=y;
insnum=in;
}
public String getDatails()
{
return "name is:"+name+" salary:"+salary+"years working is:"+year+"insurance number is:"+insnum;
}
}
public class TestEmployee
{
public static void main(String args[])
{
Person a=new Person("ramu");
Employee b=new Employee("ramu",10000.89,2023,"ABC123");
a.getName();
b.getDetails();
}
}