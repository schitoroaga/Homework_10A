import java.util.Scanner;
public class ProblemeFISA {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int n;
	n=Sc.nextInt();
	double s=0;
	for(double i=1; i<=n;i++) {
		s=s+(i/(i+1));
	}
	System.out.println(s);
}
}