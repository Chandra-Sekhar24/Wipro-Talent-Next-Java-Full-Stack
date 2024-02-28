import java.util.*;
public class M3

{
static Map<String,String> m=new Properties<String,String>();
public static void main(Strinng args[])
{
  m.put("delhi","delhi");
  m.put("gujarath","gandhinagar");
  m.put("madras","mumbai");
  Iterator r=m.iterate();
  for(Map.Entry e:r.entrySet())
  {
   System.out.println(e.getKey()+" "+e.getValue());
  }
}
}

