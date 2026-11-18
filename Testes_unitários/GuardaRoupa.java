
package com.example.demo;

public class GuardaRoupa {

    private double orcamento;

    public GuardaRoupa(double orcamento) {
        this.orcamento = orcamento;
    }

    /**
     * Calcula o preço com desconto.
     * O percentual deve estar entre 0 e 100.
     */
    public double precoComDesconto(double preco, double percentual) {

        // CORREÇÃO BUG 1
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException(
                "O desconto deve estar entre 0 e 100."
            );
        }

        return preco - (preco * percentual / 100);
    }

    /**
     * Verifica se o preço cabe no orçamento.
     * O valor exato do orçamento é permitido.
     */
    public boolean cabeNoOrcamento(double preco) {

        // CORREÇÃO BUG 2
        return preco <= orcamento;
    }

    /**
     * Verifica se o look é de gala.
     * Somente valores acima de 200 são gala.
     */
    public boolean ehDeGala(double preco) {

        // CORREÇÃO BUG 3
        return preco > 200.0;
    }

    /**
     * Registra uma compra.
     */
    public void registrarCompra(double preco) {

        // VALIDAÇÃO DO DESAFIO EXTRA
        if (preco > orcamento) {
            throw new IllegalArgumentException(
                "Orçamento insuficiente para a compra."
            );
        }

        this.orcamento = this.orcamento - preco;
    }

    /**
     * Retorna o orçamento restante.
     */
    public double getOrcamento() {
        return orcamento;
    }
}
