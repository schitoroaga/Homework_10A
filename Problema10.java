import java.util.Scanner;
public class Problema10 {
	public static void main(String args[]) {
		int h,m,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdu nr. de ore");
		h= sc.nextInt();
		System.out.println("Introdu nr. de minute");
		m= sc.nextInt();
		x= 60*h+m;
		sc.close();
		System.out.println(x);
       }

}
