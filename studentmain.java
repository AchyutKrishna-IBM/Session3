import java.util.Scanner;
class Student
{
String name;
long phone;
String roll;
int std;

//setter
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.next();
System.out.println("Enter the phone number");
phone=sc.nextLong();
System.out.println("Enter the roll number");
roll=sc.next();
System.out.println("Enter the class");
std=sc.nextInt();
System.out.println("This is setter");
}
//getter
void output()
{

System.out.println("Name:"+name);
System.out.println("phone num:"+phone);
System.out.println("roll num:"+roll);
System.out.println("class:"+std);
System.out.println("This is getter");
}
}
class studentmain
{
public static void main(String args[])
{
Student st=new Student();
st.input();
st.output();
}
}