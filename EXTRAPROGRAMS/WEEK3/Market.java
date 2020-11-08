import java.util.Scanner;
public class Market{
public static void main(String args[]){
System.out.println("Enter total things to buy:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
double A1[]=new double [n];
int A[]=new int [n];
double tb=0.0;
double fb=0.0;
double t=0.0;
double f=0.0;

for(int i=0;i<n;i++){
System.out.println("Enter the price of"+i+"items");
A1[i]=s.nextDouble();
System.out.println("Enter the quantity of item"+i+":");
A[i]=s.nextInt();
t=(double) A1[i]*A[i];
tb=tb+t;
}

System.out.println("***TOTAL BILL***==:"+tb);

if (tb>=10000){
f=(tb)*(5.0)/100;
fb=(tb)-(f);
}
if (tb>=7500 && tb<10000){
f=(tb)*(3.0)/100;
fb=(tb)-(f);
}
if (tb>=5000 && tb<7500){
f=(tb)*(2.0)/100;
fb=(tb)-(f);
}

System.out.println("***FINAL BILL***==:"+fb);
}
}
