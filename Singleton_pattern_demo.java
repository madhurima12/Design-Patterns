class Singleton_pattern
{
private static Singleton_pattern obj=new Singleton_pattern();
private Singleton_pattern()
{
}
public static Singleton_pattern getInstance()
{
return obj;
}
public void display()
{
System.out.println("Sky is Blue");
}
}
public class Singleton_pattern_demo
{
public static void main(String[] args)
{
Singleton_pattern obj=Singleton_pattern.getInstance();
obj.display();
}
}