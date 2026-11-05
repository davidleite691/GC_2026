/*
Exercicio 04
Crie um programa que leia o valor do salário mínimo e o valor do salário de um
usuário, calcule a quantidade de salários mínimos que esse usuário ganha e
imprima o resultado, assuma que o salário mínimo é R$1.320.
*/
public class App {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1320.0;
        DataIo dataIo = new DataIo(salarioMinimo);
        double salarioUsuario = dataIo.lerSalarioUsuario();
        dataIo.imprimirResultado(salarioUsuario);
    }
}
