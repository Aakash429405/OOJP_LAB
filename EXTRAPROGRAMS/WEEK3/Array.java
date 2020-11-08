import java.util.Scanner;
public class Array{ public static void main(String args [])
{ int i,sum=0,sum1=0; int A[]; Scanner s=new Scanner(System.in); 
System.out.println("Enter total elements:"); 
int n=s.nextInt();
A = new int[n]; 
for(i=0;i<n;i++)
{ System.out.println("enter elements:\n");
A[i]=s.nextInt(); 
if(i%2==0)
{ //System.out.println(A[i]);
sum=sum+A[i]; 
} else if(i%2!=0) 
{ //System.out.println(A[i]); 
sum1=sum1+A[i]; 
} }
System.out.println("Sum of even indicies is:"+sum); 
System.out.println("Sum of odd indicies is:"+sum1); 
} } 
