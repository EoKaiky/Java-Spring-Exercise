package br.com.study.TabelaFipe.model;

public record Dados(int codigo, String nome) {

    public int getCodigo() {
        return codigo;
    }
}
