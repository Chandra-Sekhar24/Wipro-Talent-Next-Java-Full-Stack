public class Animal
{
public void eat()
{
System.out.println("eating");
}
public void sleep()
{
System.out.println("sleeping");
}
}
public class Bird extends Animal
{
public void eat()
{
System.out.println("bird is eating");
}
public void sleep()
{
System.out.println("bird is sleeping");
}
public void fly()
{
System.out.println("flying");
}
public static void main(String args[])
{
Animal a=new Animal();
Bird b=new Bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
b.fly();
}
}
