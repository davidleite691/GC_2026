public class Bezerro extends VacaMae{
       
    public Bezerro(int id, String nome, String raca, int idade, String status) {
        super(id, nome, raca, idade, status);
    }
    @Override
    public void EmitirSom() {
        System.out.println("- Som: Muuu!");
    }

    @Override
    public void ColetarProduto() {
        System.out.println("Bezerro não produz leite.");
    }
    @Override 
    public void ExibirDados() {
        System.out.println("[ID: " + getId() + "] " + getNome() + " (Vaca filhote)");
        System.out.println("- Raça: " + getRaca());
        System.out.println("- Idade: " + getIdade() + " ano | Status: " + getStatus());
    }
}
