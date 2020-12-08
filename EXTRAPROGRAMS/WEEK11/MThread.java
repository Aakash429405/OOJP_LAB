/*
Write a program to create a thread and find the sum of odd numbers from 1 to 100 in
this thread. Find the sum of even numbers for the same range in the main thread.
*/

class One implements Runnable{
public void run(){
int sum=0;
for(int i=1;i<=100;i++){
if(i%2!=0)
sum=sum+i;
}
System.out.println("\nSUM OF ODD NUMBER IS:"+sum+"\n");
}
}

class MThread{
public static void main (String [] args){
One ox=new One();
Thread t=new Thread(ox);
t.start();

int sum1=0;
for(int j=1;j<=100;j++){
if(j%2==0)
sum1=sum1+j;
}
System.out.println("\nSUM OF EVEN NUMBERS IN THE GIVEN RANGE IS:"+sum1);

}
}

