import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
	    
	    System.out.println ("Informe qual é o saldo de Itu");
		double Di = sc.nextDouble();
		
		System.out.println ("Informe qual é o saldo de Caio");
	    double Dc = sc.nextDouble();
	    
	    System.out.println ("Informe qual é o preço da barrinha");
	    double P = sc.nextDouble();
		
	    System.out.println ("Informe qual é a quantidade de barrinhas");
	    int Q = sc.nextInt();
	    
	    double B = Q * P;
	    
	    double Dr = B - (Di + Dc);
	    
	    System.out.println ("O valor que a Raysa deve mandar para comprarem a barrinha é "+Dr);
	    
}
};
