import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double vdolar;
        final double COTACAO = 4.95;

        System.out.println("Digite o Valor em dólar: ");
        vdolar = scanner.nextDouble();
        System.out.printf("Valor convertido: R$ %.2f", vdolar * COTACAO);
        
        scanner.close();
    }
}
