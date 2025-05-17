import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sorvete de morango: R$6.00. Cod 1");
		System.out.println("Sorvete de Açai: R$7.00. Cod 2");
		System.out.println("Sorvete de Chocolate: R$5.50. Cod 3 \n");
	
		
		double Cod1 = 6.00;
		double Cod2 = 7.00;
		double Cod3 = 5.50;
		
		double total = 0;
		double sobra = 0;
		
	 System.out.println("Escreva o seu saldo");
	 double saldo = sc.nextDouble();
		
	 System.out.println("Escreva o codigo do Pedido");
	 int Codigo = sc.nextInt();
	 
	 System.out.println("Escreva a quantidade");
	 int quantidade = sc.nextInt();
	 
	 switch (Codigo) {
	     case 1 :
	       total = Cod1 * quantidade;
	       sobra = saldo - total;
	      break;
	     case 2 :
	       total = Cod2 * quantidade;
	       sobra = saldo - total;
	      break;
	     case 3 :
	       total = Cod3 * quantidade;
	       sobra = saldo - total;
	      break;
	      default:
	      System.out.println("Não valido");
	 }
	 if (total > saldo) {
	      System.out.println("Saldo isuficiente, não é possivel finaliza compra");
	 }
	 else {
	     System.out.println("Compra finalizada compra, o seu saldo atual é " +sobra);
	 }
	 
	}
}
