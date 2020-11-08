 
#include <stdio.h> 
 int sumaver(int *a,int *b)
{ int sum,average; sum=*a+*b; average=sum/2; printf("sum: %d\n",sum);
 return average;
}
 void printeven(int *c,int *d)
{ for(int i=*c;i<=*d;i++){
 if(i%2==o) 
printf("%d \t",i);
}}
 int main()
{ int num1,num2,num3,1argest,smallest,second_largest; 
printf("Enter first Luau: \n");
 scanf("%d",& num1.); printf("Enter second num: \n");
 scanf("%d",& num2); 
printf("Enter third num: \n"); 
scanf("%d",&num3); 
largest=((numi>num2)?(numi>num3?numLnum3):(num2>num3?num2:mun3));
 printf("Largest= %d \n",largest); 
second_largest= (num1 >= num2  && num2 >= num3) ? ((num2 >= num3) ? num2 : num3) : ((num2 num : num2)); 
printf("Second Largest= %d \n",second_largest);
 sumaver(&second_largestAlargest);
piinteven(&second_largestAlargest);
 return o; }
