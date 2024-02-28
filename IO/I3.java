import java.io.*;
public class I3
{
public static void main(String args[])throws Exception
{
String str=args[0];
String str1=args[1];
FileReader f=new File(str);
BufferReader fi=new BufferReader(f);
FileWriter f1=new FileWriter(str);
BufferWriter fi1=new BufferWriter(f1);
String s;
Map<String,Integer> m=new HahMap();
while((s=fi.readLine())!=null)
{
String a[]=s.split(" ");
for(String c:a)
{ 
Integer i=m.get(c);
if(i==null)
{
m.put(c,1);
}
else
{
m.put(c,i+1);
}
}
}
TreeMap<String,Integer> tm=new TreeMap<>();
tm.putAll(m);
for(Map.Entry<String,Integer> entry:tm.entrySet())
{
System.out.prinln(entry.getKey()+":"+entry.getValue());
}
}
}