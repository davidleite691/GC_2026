import java.util.ArrayList;
import java.util.List;
public class calculos {
    private List<Double> numeros;
    public calculos(List<Double> numeros) {
        this.numeros = new ArrayList<>(numeros);
    }

    public void imprimirMaiorMenorMedia() {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi lido.");
            return;
        }
        double maior = numeros.get(0);
        double menor = numeros.get(0);
        double soma = 0;
        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma += numero;
        }
        double media = soma / numeros.size();
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);
    }
}
