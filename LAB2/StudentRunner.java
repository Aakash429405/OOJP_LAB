import java.util.Scanner; 
class Student{ Scanner xx=new Scanner(System.in); 
//System.out.print("ENTER SUBJECTS");
 int n=xx.nextInt();
 String usn;
 String name; 
int credit[]=new int[n];
 double marks[]=new double [n]; int i,total1=0; double total=0.0; int q=0; double p=0.0,t=0.0,w=0.0; void studentDetails()
{ System.out.println("ENTER STUDENT DATA"); 
Scanner xx=new Scanner(System.in); 
System.out.println("enter usn"); 
usn=xx.nextLine(); System.out.println("enter name"); 
name=xx.nextLine(); 
System.out.println("enter credits and Marks");
 for(i=0; i<n; i++) { System.out.print("Enter Marks of Subject"+(i+1)+ marks[i] = xx.nextDouble();
 total = total + marks[i];
 System.out.print("Enter Credits of Subject"+(i+1 credit[i]=xx.nextInt();
 totall=total1+credit[i];
 p= (double)(credit[i]*marks[i])+p; }
 System.out.println(" TOTAL MARKS "+p);
 t=(p)/totall;
 w=t/10.0;
 q=(int) t/10;
 
} 
void printDetails()
{ System.out.println("*****************");
 System.out.println("STUDENT DATA"); 
System.out.println("USN: "+usn+" "+"NAME: "+name); 
} 
void Grade(){ System.out.println("\n");
System.out.println("GRADE OF THE STUDENT IS:"); 
if(q>=9) System.out.println("S");
 else if(q>=8 && q<9) System.out.println("A"); 
else if(q>=7 && q<8) System.out.println("B");
 else if(q>=6 && q<7) System.out.println("C"); 
else if(q>=5 && q<6) System.out.println("D"); 
else if(q>=4 && q<5) System.out.println("E"); 
else System.out.println("F");
 System.out.println("SCPA:"+w); 
} 
} 
public class StudentRunner{
 public static void main(String args[])
{ Student s=new Student(); 
s.studentDetails(); s.printDetails(); s.Grade(); 
} }
