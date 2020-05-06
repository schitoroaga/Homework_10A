import java.util.Scanner;
public class ProblemeFOR {
	public static void main(String[] args) {
		double n,s=0;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextDouble();
		for(int i=1; i<=n;i++) {
			s=s+(2*i-1);
		}
		System.out.println(s);
	}

}
