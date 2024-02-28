package com.automobile;
abstract class Vehicle
{
public abstract String getModelName();
public abstract String getRegistrationNumber();
public abstract String getOwnerName();
}
package com.automobile.twowheeler;
import com.automobile.*;
class Hero extends Vehicle
{
public abstract String getModelName()
{
return "HFDelux";
}
public abstract String getRegistrationNumber()
{
return "12ASD";
}
public abstract String getOwnerName()
{
return "pavan";
}
}
public int getSpeed()
{
return 10;
}
public void radio()
{
System.out.println("control the radio device");
}
}
class Honda extends Vehicle
{
public abstract String getModelName()
{
return "CDDelux";
}
public abstract String getRegistrationNumber()
{
return "12ASc";
}
public abstract String getOwnerName()
{
return "soichio";
}
public int getSpeed()
{
return 120;
}
public void cdplayer()
{
System.out.println("control the cd player");
}
}
public class Test
{
public static void main(String args[])
{
Hero h=new Hero();
System.out.println(h.getSpeed()+" "+h.getOwnerName()+" "+h.getRegistrationNumber()+" "+h.getModelName());
Honda h1=new Honda();
System.out.println(h1.getSpeed()+" "+h1.getOwnerName()+" "+h1.getRegistrationNumber()+" "+h1.getModelName());
}
}
 
