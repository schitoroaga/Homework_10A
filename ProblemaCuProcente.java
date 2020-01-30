import java.util.Scanner;
public class ProblemaCuProcente {
	public static void main(String args[]) {
		int m,p,c;
		Scanner sc=new Scanner(System.in);
		m= sc.nextInt();
		p= sc.nextInt();
		c=(100*m)/(100-p);
		System.out.println(c);
		
	}
}
