import java.util.*;
class Employee
{
int empId;
String empNmae;
String email;
String gender;
float salary;
Employee(int id,String name,String email,String g,float s)
{
empId=id;
empName=name;
email=email;
gender=g;
salary=s;
}
void getEmployeeDetails()
{
System.out.println(empId+" "+empName+" "+email+" "+gender+" "+salary);
}
}
calss EmployeeDB
{
ArrayList<Employee> a=new ArrayList<Employee>();
boolean addEmployee(Employee e)
{
a.add(e);
}
boolean deleteEmployee(int id)
{
for(int i=0;i<a.length;i++)
{
Employee s=a.get(i);
if(id==s.empId)
{
a.remove(s);
break;
}
}
return true;
}
float paySlip(int empId)
{
for(int i=0;i<a.length;i++)
{
Employee s=a.get(i);
if(s.empId==empId)
{
return s.salary;
}
}
}
public static void main(String args[])
{
System.out.println("enter the employee details:");
Employee e1=new Employee(1,"gopi","gopi@gmail.com","male",10000.78f);
Employee e2=new Employee(2,"ram","ram@gmail.com","male",20000.78f);
Employee e3=new Employee(3,"syam","syam@gmail.com","male",30000.78f);
EmployeeDB d=new EmployeeDB();
d.addEmployee(e1);
d.addEmployee(e2);
d.addEmployee(e3);
d.deleteEmployee(1);
d.paySlip(2);
e2.getEmployeeDetails();
}
}

