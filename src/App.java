// Nome: Matheus Honorato Leite Teixeira
// Matricula: 1261929133

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double vdolar;
        final double COTACAO = 4.95;

        System.out.print("Digite o Valor em dólar: ");
        vdolar = scanner.nextDouble();
        System.out.printf("Valor convertido: R$ %.2f", vdolar * COTACAO);
        
        scanner.close();
    }
}
