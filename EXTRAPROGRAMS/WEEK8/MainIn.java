/*Develop a Java program to implement the hierarchy given below. Include atleast one
appropriate member in each of these classes. Set and display details in each of the class
and create objects of the leaf members in the hierarchy.*/

import java.util.*;

class Person{
private String name;
void setname(String n){
name=n;
}
String getname(){
return name;
}
}

class Emp extends Person{
}
class Student extends Person{
}
class Teaching extends Emp{
}
class NonTeaching extends Emp{
}
class Ug extends Student{
}
class Pg extends Student{
}
class MainIn{

public static void main(String args[]){

Emp e=new Emp();

e.setname("Pankaj");

System.out.println("NAME OF EMPLOYEE IS:"+e.getname());

Student s=new Student();

s.setname("Praven");

System.out.println("NAME OF THE STUDENT IS:"+s.getname());

Ug u=new Ug();

u.setname("AAKASH");

System.out.println("NAME OF THE UG STUDENT IS:"+u.getname());

Pg p=new Pg();

p.setname("Praven");

System.out.println("NAME OF THE PG STUDENT IS:"+p.getname());

Teaching t=new Teaching();

t.setname("Pampam");

System.out.println("NAME OF THE TEACHER IS:"+t.getname());

NonTeaching n=new NonTeaching();

n.setname("pradeep");

System.out.println("NAME OF THE NONTEACHING EMPLOYEE IS:"+n.getname());

}

}
