import java.util.Scanner;
public class Problema6 {
	public static void main(String args[]) {
		int a,b;
		double i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdu valoarea primei catete");
		a= sc.nextInt();
		System.out.println("Introdu valoarea catetei a 2");
	    b= sc.nextInt();
	    i= Math.sqrt(a*a+b*b);
	    System.out.println(i);
	
	}


}
