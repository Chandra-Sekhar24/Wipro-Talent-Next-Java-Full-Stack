public class Fruit
{
String name;
String taste;
int size;
Fruit(String s,String t,int s1)
{
name=s;
taste=t;
size=s1;
}
public void eat()
{
System.out.println("name of fruit is:"+name+" and its taste is:"+taste");
}
}
public class Apple extends Fruit
{
Apple(String s,String t,int s1)
{
super(s,t,s1);
}
public void eat()
{
System.out.println("name of fruit is:"+name+" and its taste is:"+taste");
}
}
public class Orange extends Fruit
{
Orange(String s,String t,int s1)
{
super(s,t,s1);
}
public void eat()
{
System.out.println("name of fruit is:"+name+" and its taste is:"+taste");
}
}
public class FruitTest
{
public static void main(String args[])
{
Apple a=new Apple("apple","sweet",100);
Orange o=new Orange("orange","sour",50);
a.eat();
o.eat();
}
}