import java.util.Scanner;

class Age
{
int years;
int months;

int getage()
{
String name;
int a=0;
int b=0;
int p=0;
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE AGE: YEARS AND MONTHS");
a=s.nextInt();
b=s.nextInt();
Scanner s1=new Scanner(System.in);
System.out.println("ENTER THE NAME:");
name=s1.nextLine();
b=b%12;
return p=a+b;
}

}

class AgeRunner{
public static void main(String args[]){

Age x=new Age();
Age y=new Age();

if(x.getage()>y.getage())
System.out.println(x.getage()+" is elder.");
else 
System.out.println(y.getage()+" is elder.");
}
}
