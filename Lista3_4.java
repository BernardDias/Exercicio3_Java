import java.util.Scanner;

public class Lista3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        double soma = 0;
        while(cont < 6){
            System.out.println("Informe o " + cont + " valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
            cont++;
        }
        scanner.close();
        System.out.println("A média dos valores informados é: " + (soma / 5));
    }
}
