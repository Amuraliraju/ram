class Counter
{
public  void calculate()
{
String name="Sri Chaitanya";
String name="Narayana";
String name="Gowtham";
{
System.out.println(n*i);
try
{
Thread.sleep(500);
}
catch(Exception e)
{
}
}
}
}
class School1 extends Thread
{
Counter c;
School1(Counter c)

{
this.c=c;
}
public void run()
{
c.calculate(5);
}
}
class School2 extends Thread
{
Counter c;
School2(Counter c)

{
this.c=c;
}
public void run()
{
c.calculate(5);
}
}
class School3 extends Thread
{
Counter c;
School3(Counter c)

{
this.c=c;
}
public void run()
{
c.calculate(2);
}
}
class School
{
public static void main(String args[])
{
Counter counter=new Counter();
School1 s1=new School1(counter);
School2 s2=new School2(counter);
School3 s3=new School3();
school1.start();
school2.start();
school3.start();

}
}
