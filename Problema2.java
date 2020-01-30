import java.util.Scanner;
public class Problema2 {
	public static void main(String args[]) {
		int r,a;
		Scanner sc=new Scanner(System.in);
		r= sc.nextInt();
		a= sc.nextInt();
		if (r*2==a)
			System.out.println ("Cercul incape in patrat");
			else System.out.println ("Cercul nu incape in patrat");
		}
}
