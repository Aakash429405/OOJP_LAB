import java.util.Scanner;
public class Twoarray{
public static void main(String args []){
int i=0,j=0,k=0,n;
int A[];
int B[];
int C[];
System.out.println("Enter total elements:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
A = new int[n];
B=new int [n];
C=new int [n];
int sum=0,average=0,max=0,min=0,count=0;
for(i=0;i<n;i++){
if(A[i]%2==0){
C[j]=A[i];
sum=sum+C[j];
j++;}
else {
B[k]=A[i];
k++;}}
for(i=0;i<j;i++){
if(C[j]>max)
max=B[j];}
for(i=0;i<j;i++){
if(C[j]<min)
min=B[j];}
System.out.println("IN ARRAY C MAX IS:"+max+"MIN IS"+min+"SUM IS"+sum+"AVERAGE IS"+sum/(k+1)); 
}}
