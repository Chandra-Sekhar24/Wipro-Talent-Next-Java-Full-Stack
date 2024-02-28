import java.util.*;
public class Author
{
String name,email;
char gender;
Author(String s,String st,char c)
{
name=s;
email=st;
gender=c;
}
public String toString()
{
return "Author name:"+name+"author email:"+email+"gender:"+gender;
}
}
public class Book
{
int qtyInstock;
String name;
Author aut;
double price;
Book(String s,Author a,double d,int q)
{
name=s;
aut=a;
price=d;
qtyInstock=q;
}
public void get()
{
System.out.println("book name:"+name+"Author details:"+aut+"price:"+price+"quantity in stocks:"+qtyInstocks);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the details:");
String name=s.next();
String email=s.next();
char c=s.next().charAt(0);
String name=s.next();
double price=s.nextDouble();
int qtyInstocks=s.nextInt();
Author a=new Author(name,email,c);
Book b=new Book(name,a,price,qtyInStocks);
b.get();
}
}


