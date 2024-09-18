package com.main.java.com.byteplace.services.venda;

public abstract class PagamentoTemplateMethod {

    public void pagar(String dadosPagamento) {        
        boolean isConexaoAutenticada = autenticarPagamento(dadosPagamento);

        if (!isConexaoAutenticada) return;

        boolean isPagamentoValido = validarPagamento(dadosPagamento);

        if(isPagamentoValido){

            confirmarPagamento(dadosPagamento);

        }
    
    }

    public boolean autenticarConexaoBanco(String dadosPagamento);

    public boolean validarPagamento(String dadosPagamento);

    public void confirmarPagamento(String dadosPagamento);

}
