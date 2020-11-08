#include <stdio.h>
 #include <math.h> 
 int main()
{ float area,vol,r,h; 
float area_cylinder=o.o,area_cone=o.o,area_sphere=o.o,volume_cylinder=o.o,volume_cone=o.o,volume_sphere=o.o; 
printf("Enter n \n"); 
printf("IF YOU WANT TO STOP PRESS -1\n");
 scanf("%d",& n); 
while(n! =-1)
{ printf("Enter r \n");
 scanf("%f',& r); 
printf("Enter h \n"); 
scanf("%f',&h);
 area_cylinder=(2.0*(3.14)*r)+(2.0*3.14*r*2)); 
area_cone=3.14*(r+sqrt(h*h+er)); 
area_sphere=4.0*3.14*r*r;
 volume_cone=(3.14*r*r*h)/3;
 volume_cylinder=3.14*r*h; 
volume_sphere=(4.0/3.0)*3.14*r*r; 
printf("volume and area of sphere: %f and %f\n",volume_sphere,area_sphere); 
printf("volume and area of cylinder: %f and %f\n",volume_cylinder,area_cylinder);
 printf("volume and area of cone: %f and %f\n",volume_cone,area_cone); 
printf("Enter n"); 
scanf("%d",& n); }
 return o; } 
