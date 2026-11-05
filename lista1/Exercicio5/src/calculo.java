public class calculo {
    private lerDados dados;
    public calculo(lerDados dados) {
        this.dados = dados;
    }
    public void calcular() {
        int hora = dados.hora();
        int minuto = dados.minuto();
        int segundo = dados.segundo();

        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Horário inválido.");
            return;
        }

        int segundosPassados = (hora * 3600) + (minuto * 60) + segundo;
        int segundosFaltando = (24 * 3600) - segundosPassados;

        System.out.println("Segundos passados desde 0h00min0s: " + segundosPassados);
        System.out.println("Segundos faltando para a meia-noite: " + segundosFaltando);
    }
}
