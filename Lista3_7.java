import java.util.Scanner;

public class Lista3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numpares = 1;
        for(int i = 1; i <= 10; i++){
            System.out.println("Informe o " + i + " valor");
            int numero = scanner.nextInt();

            if(numero % 2 == 0){
                numpares++;
            }
        }
        scanner.close();
        System.out.println("Números pares: " + numpares);
    }
}
