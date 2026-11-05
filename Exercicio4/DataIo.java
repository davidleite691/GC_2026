import java.util.Scanner;
public class DataIo {
    private Scanner sc;
    private double salarioMinimo;

    public DataIo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
        this.sc = new Scanner(System.in);
    }
    public double lerSalarioUsuario() {
        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = sc.nextDouble();
        return salarioUsuario;  
    }
    public void imprimirResultado(double salarioUsuario) {
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);
    }

}
