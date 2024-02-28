package test;
public class foundation
{
private int var1=10;
int var2=20;
protected int var3=30;
public int var4=40;
}
import test.*;
public class A
{
public static void main(String args[])
{
foundation f=new foundation();
System.out.println(f.var1+" "+f.var2+" "+f.var3+" "+f.var4);
}
}
