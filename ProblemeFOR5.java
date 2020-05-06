import java.util.Scanner;
public class ProblemeFOR5 {
public static void main(String[] args) {
	double n,s=1;
	Scanner Sc=new Scanner(System.in);
	n=Sc.nextDoube();
	for(int i=1;i<=n;i++) {
		s=s*(3*i);
	}
	System.out.println(s);
}
}
