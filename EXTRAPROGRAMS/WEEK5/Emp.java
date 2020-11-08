import java.util.Scanner;

class Employee{
int empid;
String empname;
int empnohrs;
int empbasic;
int emphra; 
int empda;
int empit;
int empgross=0;

void details(){
int x=0;
System.out.println("Enter details: id,name,nohrs,basic,hra,da,it");
Scanner sc=new Scanner(System.in);
empid=sc.nextInt();
Scanner s=new Scanner(System.in);
empname=s.nextLine();
empnohrs=sc.nextInt();
empbasic=sc.nextInt();
emphra=sc.nextInt();
empda=sc.nextInt();
empit=sc.nextInt();
System.out.println("**********\n empid"+empid+" EMPNAME "+empname+" EMPNOHRS "+empnohrs+" EMPBASIC "+empbasic);
System.out.println("EMPHRA IN PERCENTAGE (%)"+emphra+"EMPDA IN PERCENTAGE (%)"+empda+"and EMPIT IN PERCENTAGE (%)"+empit);
empgross =empbasic +(empbasic*emphra)+ (empbasic*empda) - (empbasic*empit);
if(empnohrs>200){
x=200-empnohrs;
empgross=empgross+(x*100);
System.out.println("GROSS PRODUCT IS:"+empgross);}
else 
System.out.println("GROSS PRODUCT IS:"+empgross);}
}

class Emp{
public static void main (String args[]){
Employee e=new Employee();
e.details();
}
}
