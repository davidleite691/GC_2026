public class GalinhaMae implements Animal{
    private int id;
    private  String nome;
    private String raca;
    private int idade;
    private String status;

    public GalinhaMae(int id, String nome, String raca, int idade, String status) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.status = status;
    }

    @Override 
    public void EmitirSom(){
        System.out.println("- Som: Có-Có!");
    }

    @Override 
    public void ExibirDados(){
        System.out.println("[ID: " + id + "] " + nome + " (Galinha)");
        System.out.println("- Raça: " + raca);
        System.out.println("- Idade: " + idade + " ano | Status: " + status);
    }

    @Override 
    public void ColetarProduto(){
        System.out.println("Voce coletou: Ovos");
    }
}
