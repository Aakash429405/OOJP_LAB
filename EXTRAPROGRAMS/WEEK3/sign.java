/*Accept an array of n integers. Find the number of positive numbers, negative numbers
and zeros.*/

import java.util.Scanner;
public class Sign{
public static void main(String args []){
int i,a=0,b=0,c=0;
int A1[];
Scanner s=new Scanner(System.in);
System.out.println("Enter total elements:");
int n=s.nextInt();
A1 = new int[n];

for(i=0;i<n;i++){
System.out.println("enter elements:\n");
A1[i]=s.nextInt();
if(A1[i]>0)
a++;
else if(A1[i]<0)
b++;
else if(A1[i]==0)
c++;
}
System.out.println("Numbers of positives are:"+ a);
System.out.println("Numbers of negatives are:"+ b);
System.out.println("Numbers of zeroes are:"+ c);
}
}
