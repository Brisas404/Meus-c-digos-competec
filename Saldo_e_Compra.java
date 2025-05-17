import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("o Sorvete de morango está R$6.00. Cod 1");
		System.out.println("o Sorvete de Açai está R$7.00. Cod 2");
		System.out.println("o Sorvete de Chocolate está R$5.50. Cod 3");
		
		double Cod1 = 6.00;
		double Cod2 = 7.00;
		double Cod3 = 5.50;
		
		double total = 0;
		
			 System.out.println("Escreva o seu saldo");
	 double saldo = sc.nextDouble();
		
		 System.out.println("Escreva o codigo do Pedido");
	 int Codigo = sc.nextInt();
	 
	    System.out.println("Escreva a quantidade");
	 int quantidade = sc.nextInt();
	 
	 switch (Codigo) {
	     case 1 :
	       total = Cod1 * quantidade; 
	      break;
	     case 2 :
	       total = Cod2 * quantidade; 
	      break;
	     case 3 :
	       total = Cod3 * quantidade;
	      break;
	      default:
	      System.out.println("Não valido");
	 }
	 
	 
	 
	 if (total > saldo) {
	      System.out.println("Saldo isuficiente, não é possivel finaliza compra");
	 }
	 
	 else {
	     System.out.println("Compra finalizada compra");
	 }
	 
	 
	}
}