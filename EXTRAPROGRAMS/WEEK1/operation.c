#include <stdio.h>
#include<math.h>
int main(){
int a,b,c,d;
char oper ,again='Y';
printf("Enter first number:");
scanf("%d",& a);
printf("Enter the operation:");
scanf("%c",& oper);
printf("Enter the second number:");
scanf("%d",&b);
while(again=='y'|| again=='Y'){
if(oper=='+')
printf("%d",a+b);} 
}else if(oper=='-')
{ - printf("%d",a-b);} 
else if(oper== ')
{ - printf("%d",a*b);} 
else if(oper =='/')
{ - printf("%d",a/b);} 
else if(oper == '>')
{ - printf("%d",a>b);} 
]else if(oper =='<')
{ - printf("%d",a<b);} 
else if(oper=='==')
{ - printf("%d",a==b);}
else if(oper=='!=')
{ - printf("%d",a!=b);} 
else if(oper=='%') 
d=a%b; 
printf("%d", & d);
}
else if(oper=='+=')
{ c=(a+=b); 
printf("%d",& c);
}
else printf("\n Invalid choice , please Select valid one \n \n"); 
printf("\n if want to =Ike press y OR Y \n"); 
scanf("%s",& again); 
if(again =='y' || again=='Y')
{ printf(" \nEnter first number \n");
scanf("%d",&a);
printf("\n Enter operation \n");
scanf("%s",& oper); 
printf("\n Enter second number \n"); 
scanf("%d",&b);
}
}
return 0;
}
