
import java.util.Scanner;
public class SimonCh {
    public static void main(String args[]){
	int a,b,c,sum;
	float ma;
Scanner sc=new Scanner(System.in);
a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();
sum= a+b+c;
ma= (a+b+c)/3;
sc.close();
System.out.println("Suma="+sum+'\n'+"Media Aritmetica="+ma);

}
}

