/*
Exercicio 03
Crie um programa que leia 3 números, imprima o maior, o menor e a média
aritmética.
*/
public class App {
    public static void main(String[] args) throws Exception {
        lerNumeros ler = new lerNumeros();
        ler.leituraNumeros();
        
        calculos calc = new calculos(ler.getNumeros());
        calc.imprimirMaiorMenorMedia();
    }
}
