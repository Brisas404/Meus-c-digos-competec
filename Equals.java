import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Senha = "BATATA";
		System.out.println("Digite sua senha");
        String tentativa = sc.nextLine();
        
        if (tentativa.equals("BATATA"){
            System.out.println("Parabens");
        } else {
            System.out.println("Não sabe a senha né BB");
        }
        
	}
}