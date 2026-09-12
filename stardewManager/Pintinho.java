public class Pintinho extends GalinhaMae{

    public Pintinho(int id, String nome, String raca, int idade, String status) {
        super(id, nome, raca, idade, status);
    }

    @Override
    public void EmitirSom() {
        System.out.println("- Som: Piu-piu!");
    }

    @Override
    public void ColetarProduto() {
        System.out.println("Pintinho não produz ovos.");
    }
}
