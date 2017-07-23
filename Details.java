class Details1
{
int sno;
String name;
int age;
void methodName(int sno, String name, int age);
{
System.out.println("hello");
}}
class Details
{
public static void main(String args[])
{
Details1 d1=new Details1();
d1.sno=11;
d1.name="rrr";
d1.age=22;
System.out.println(d1.sno+" "+d1.name+" "+d1.age);
}
}
