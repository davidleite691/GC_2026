import java.util.Scanner;
public class Leitura {
    private Scanner sc;
    public Leitura() {
         this.sc = new Scanner(System.in);
    }
    public void lerNome() {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
        sc.close();
    }
}
