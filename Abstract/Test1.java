package music;
interface Playable
{
public void play();
}
package music.string;
class Veena implements Playable
{
public void play()
{
System.out.println("playing with veena");
}
}
class SaxoPhone implements Playable
{
public void play()
{
System.out.println("playing with saxophone");
}
}
public class Test1
{
public static void main(String args[])
{
Veena v=new Veena();
v.play();
SaxoPhone s=new SaxoPhone();
s.play();
}
}