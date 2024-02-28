public class Shape
{
public void draw()
{
System.out.println("Drawing shape");
}
public void erase()
{
System.out.println("Erasing shape");
}
}
class Triangle extends Shape
{
public void draw()
{
System.out.println("Drawing triangle");
}
public void erase()
{
System.out.println("Erasing triangle");
}
}
class Square extends Shape
{
public void draw()
{
System.out.println("Drawing square");
}
public void erase()
{
System.out.println("Erasing square");
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Drawing circle");
}
public void erase()
{
System.out.println("Erasing circle");
}
}
class ShapeTest
{
public static void main(String args[])
{
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.erase();
}
}