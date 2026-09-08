public class FabricarPicareta {
    int forca;
    int durabilidade;
    String material;

    public FabricarPicareta(int forca, int durabilidade, String material){
        this.forca = forca;
        this.durabilidade = durabilidade;
        this.material = material;
    }
    public String fabricacao(){
        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);

        if (durabilidade <= 0 || forca <= 0) {
            System.out.println(" Picareta inválida!");
            return null;
        }
        System.out.println("Picareta de " + material + " fabricada com sucesso!");
        return "Picareta de " + material + " (D: " + durabilidade + ", F: " + forca + ")";
    }
}
