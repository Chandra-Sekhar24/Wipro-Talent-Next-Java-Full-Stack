import java.util.*;
public class M4
{
public static void main(String args[])
{
HashMap<String,Integer> h=new HashMap<String,Integer>();
Scanner s=new Scanner(System.in);
System.out.println("enter the key and value:");
String s1=s.next();
int s2=s.next();
Iterator r=h.entrySet().iterator();
int f1=0,f2=0;
while(r.hasNext())
{
Map.Entry t=(Map.Entry)r.next();
if(s1.equals(t.getKey()))
  f1=1;
if(s2==t.getValue())
  f2=1;
}
if(f1==1)
  System.out.println("key is found");
if(f2==1)
  System.out.println("value is found");
}
}


  