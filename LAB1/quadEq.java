import java.util.Scanner;
public class Quadraticeq {
   public static void main(String args[]){
		double x2 = 0.0, x1 = 0.0, x3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextDouble();

      System.out.println("Enter the value of b ::");
      double b = sc.nextDouble();

      System.out.println("Enter the value of c ::");
      double c = sc.nextDouble();

      double D = (b*b)-(4*a*c);
		x3 = (-b) / (2 * a);
      double sq = Math.sqrt(D);
		if (D > 0) {
         x1 = (-b + sq)/(2*a);
         x2 = (-b - sq)/(2*a);
            System.out.println("ROOTS ARE REAL AND DISTINCT");
			String strDouble = String.format("roots are %.4f and %.4f", x1, x2);
			System.out.println(strDouble);
      }else if(D == 0){
			x3 = (-b) / (2 * a);
			System.out.println("ROOTS ARE REAL AND EQUAL");
			String str1 = String.format("Roots are %.4f and both are equal", x3);
			System.out.println(str1);
      }
      else if(D<0) {
		System.out.println("ROOTS ARE UNREAL");
	}
   }
}
