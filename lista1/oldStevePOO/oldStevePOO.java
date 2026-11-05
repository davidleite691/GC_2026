public class oldStevePOO {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        // CRIANDO OBJETOS

        Picareta p1 = new Picareta("madeira", 50, 5);
        Picareta p2 = new Picareta("pedra", 70, 8);
        Picareta p3 = new Picareta("ferro", 100, 12);
        Picareta p4 = new Picareta("ouro", 30, 15);

        // FABRICANDO

        p1.fabricar();
        p2.fabricar();
        p3.fabricar();
        p4.fabricar();


        // MINERANDO COM A PICARETA DE FERRO

        System.out.println("\nUsando picareta de ferro...");

        p3.minerar(30);
        p3.minerar(20);

        // REPARANDO A PICARETA DE FERRO
        System.out.println("\nReparando a picareta de ferro...");
        p3.reparar(50);

        // ESTADO FINAL

        System.out.println("\nEstado final das picaretas:");
        System.out.println("• " + p1.material +" - durabilidade: " + p1.durabilidade);
        System.out.println( "• " + p2.material + " - durabilidade: " + p2.durabilidade);
        System.out.println("• " + p3.material +" - durabilidade: " + p3.durabilidade);
        System.out.println("• " + p4.material +" - durabilidade: " + p4.durabilidade);

    }
}
