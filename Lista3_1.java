import java.util.Scanner;

public class Lista3_1 {
    public static void main(String[] args) {
        
        double nota = -1;

        Scanner scanner = new Scanner(System.in);
        
        
        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
        
        System.out.println("Nota digitada: " + nota);
    
        scanner.close();

    }
}
