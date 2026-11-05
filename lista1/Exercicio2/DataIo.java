import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataIo {
    private List<Double> numeros;
    private Scanner scanner;

    public DataIo() {
        this.scanner = new Scanner(System.in);
        this.numeros = new ArrayList<>();
    }

    public List<Double> lerNumero() {
        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble();
        numeros.add(numero1);

        System.out.println("Digite outro número: ");
        double numero2 = scanner.nextDouble();
        numeros.add(numero2);
        scanner.close();

        return numeros;
    }
    
    public void imprimirNumeros(List<Double> numeros) {
        System.out.println("Os números digitados foram: ");
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }
}
