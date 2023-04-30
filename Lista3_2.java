import java.util.Scanner;

public class Lista3_2 {
    public static void main(String[] args) {
        
        double usuario, senha;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu usuario: ");
        usuario = scanner.nextDouble();

        System.out.print("Digite sua senha: ");
        senha = scanner.nextDouble();

        while (usuario == senha) {
            System.out.print("Valor inválido. Tente novamente. ");
            
            
            if (usuario != senha) {
                System.out.println("Usuario cadastrado com sucesso!");
            }
        }
        
      
    
        scanner.close();
        
    }
}