package br.com.study.TabelaFipe.service;

public interface IconverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
