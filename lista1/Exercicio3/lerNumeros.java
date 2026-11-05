import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lerNumeros {
    private Scanner scanner;
    private List<Double> numeros;
    
    public lerNumeros() {
        scanner = new Scanner(System.in);
        numeros = new ArrayList<>();
    }
    public void leituraNumeros() {
        System.out.println("Digite 3 números:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }
        scanner.close();
    }
    public List<Double> getNumeros() {
        return numeros;
    }
}
