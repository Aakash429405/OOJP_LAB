import java.util.Scanner;

class CircleDemo{

double radius,area,perimeter;

void getRadius(){
System.out.println("Enter Radius:");
Scanner s=new Scanner(System.in);
radius = s.nextDouble();
}

void Area(){
area=3.14*radius*radius;
System.out.println("AREA:"+area);
}

void Perimeter(){
perimeter=2*3.14*radius;
System.out.println("PERIMETER:"+perimeter);
}

void Details(){
System.out.println("AREA , PERIMETER ARE :"+area+perimeter+"OF CIRCLE OF RADIUS "+radius);
}

}
class CircleRunner{
public static void main (String args []){
CircleDemo c=new CircleDemo();
c.getRadius();
c.Area();
c.Perimeter();
}
}
