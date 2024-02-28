import java.util.*;
public class Box
{
int breadth,heigth,depth;
Box(int a,int b,int c)
{
breadth=a;
height=b;
depth=c;
}
public int volume()
{
return breadth*height*depth;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
Box b=new Box(a,b,c);
System.out.println("volume is:"+b.volume());
}
}