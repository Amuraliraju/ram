class D
{
int x;
static int y=15;
int z;
}
public class Demo1
{
public static void main(String args[])
{
//int z=10;

D d1=new D();
//System.out.println(z);
d1.x=20;
//d1.y=15;
d1.z=10;
System.out.println(d1.x);
System.out.println(D.y);
System.out.println(d1.z);
}
}

