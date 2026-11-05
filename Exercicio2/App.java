/*
Exercicio 02
Crie um programa que receba 2 números e imprima na tela.
*/
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        DataIo ler = new DataIo();
        List<Double> numeros = ler.lerNumero();
        ler.imprimirNumeros(numeros);
    }
}
