import java.util.Scanner;
public class stardewManager {
    public static void main(String[] args) throws Exception {
        Animal[] animais = {
            new VacaMae(101, "Mimosa", "Holandesa", 7, "Sem filhotes"),
            new GalinhaMae(102, "Giselda", "Caipira", 1, "Botando ovos"),
            new Pintinho(103, "Chiquinha", "Caipira", 1, "Saudável"),
            new Bezerro(104, "Bento", "Holandesa", 1, "Dormindo")
        };

        int TotalElementos = animais.length;

        System.out.println("--- Menu Principal ---");
        System.out.println("1. Ver animais do curral");
        System.out.println("2. Comercio (Coletar/Retirar produtos");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        switch (num) {
            case 1:
                System.out.println("---------- ANIMAIS NO CURRAL: ----------");
                for (int i = 0; i < TotalElementos; i++) {
                    animais[i].ExibirDados();
                }
                System.out.println("----------------------------------------");
                break;
            case 2:
                for (int i = 0; i < TotalElementos; i++) {
                    animais[i].ColetarProduto();
                }
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
