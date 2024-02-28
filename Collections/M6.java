import java.util.*;
public class M6
{
public static void main(String args[])
{
TreeMap<String,String> h=new TreeMap<String,String>();
Scanner s=new Scanner(System.in);
System.out.println("enter the key and value:");
String s1=s.next();
String s2=s.next();
h.put(1,4567);
h.put(2,9876);
int f1=0,f2=0;
for(Map.Entry<String,String> t:h.entrySet())
{
if(s1.equals(t.getKey()))
  f1=1;
if(s1.equals(t.getValue()))
  f2=1;
}
if(f1==1)
  System.out.println("key is found");
if(f2==1)
  System.out.println("value is found");
}
}


  