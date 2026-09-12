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
    @Override 
    public void ExibirDados() {
        System.out.println("[ID: " + getId() + "] " + getNome() + " (Galinha filhote)");
        System.out.println("- Raça: " + getRaca());
        System.out.println("- Idade: " + getIdade() + " ano | Status: " + getStatus());
    }
}
