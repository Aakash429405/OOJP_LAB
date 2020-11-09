/*Develop a Java program to create a class Student whose variables are usn, name and sem.
Derive a class Test from Student to include an array of cie marks of each course and their
corresponding credits in another array. Derive a class Exam from Test which includes an
array of see marks. Derive a class Result which calculates the grade for each course and the
SGPA. Create n student objects and displays all the above details.*/

import java.util.*;

class Student {
String usn;
String name;
String sem;
int i=0;
void Details(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the case:");
int n=s.nextInt();
for(i=0;i<n;i++){
System.out.println("Enter all details: USN - NAME - SEM :");
usn=s.next();
name=s.nextLine();
sem=s.next();
}
}
}

class Test extends Student{
void cieMarks(){
int a[]=new int[5];
for(int j=0;j<5;j++)
{
System.out.println("Enter the CIE Marks of Students: out of 50");
a[i]=s.nextInt();
}}
void Credits(){
int b[]=new int[5];
for(int k=0;k<5;k++)
{
System.out.println("Enter the Credits of Each Course:");
b[i]=s.nextInt();
}}

}

class Exam extends Test{
void seeMarks(){
int c[]=new int[5];
for(int l=0;l<5;l++)
{
System.out.println("Enter the SEE Marks of Students: out of 100");
c[l]=s.nextInt();
}}

}

class Result extends Exam{
void result(){
int t[]=new int[5];
for(int r=0;r<5;i++){
t[i]=(a[r]+c[r]/2);
System.out.println("TOTAL MARKS:"+t[i]);
}
int SGPA[]=new int[5];
for(int n=0;n<5;n++){
SGPA[n]=(t[n]*b[n])/b[n];

System.out.println("SGPA is "+SGPA[n]);
}}
}

class Week{
public static void main (String args []){
Test t=new Test();
t.Details();
t.ciemarks();
t.Credits();
Exam e=new Exam();
e.seeMarks();
Result w=new Result();
w.result();
}}
