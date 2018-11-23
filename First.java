class Demo
{
String name;
int age;
String title="Krishna";
Demo()
{
name="Achyut";
age=25;
}
void output()
{
System.out.println("My name is:"+name);
System.out.println("My age is:"+age);
}
}

class Practice extends Demo
{
int registration_number;
String College;
int Salary;
String home;
String title="Kumar";
Practice()
{
super();
System.out.println("sub class:"+title);
System.out.println("parent class:"+super.title);
registration_number=25715;
College="CEB";
}
void output()
{
super.output();
System.out.println("My reg num is:"+registration_number);
System.out.println("My college name is:"+College);
}

void Practice(int Salary,String home)
{
this.Salary=Salary;
this.home=home;
System.out.println("My Salary is:"+Salary);
System.out.println("My home is in:"+home);
}
}

class First
{
public static void main(String args[])
{
Practice pr=new Practice();
pr.output();
pr.Practice(40000,"Patna");
}
}


