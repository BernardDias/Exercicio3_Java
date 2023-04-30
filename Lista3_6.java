import java.util.Scanner;

public class Lista3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.println("Informe o valor final: ");
        int vlfinal = scanner.nextInt();
        scanner.close();
        
        for(int i = inicio; i <= vlfinal; i++){
            System.out.println(i);
        }
    }
}
