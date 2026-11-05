/*
Exercicio 05
Crie um programa que armazene um horário (hora, minuto e segundo) em
variáveis, depois, determine e exiba a quantidade de segundos que se
passaram desde as 0h00min0s e a quantidade de segundos que faltam para a
meia-noite.
*/
public class App {
    public static void main(String[] args) throws Exception {
        lerDados dados = new lerDados(12, 30, 15);
        calculo calc = new calculo(dados);
        calc.calcular();
    }
}
