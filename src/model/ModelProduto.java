/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.interfProduto;

/**
 *
 * @author Joshua
 */
public class ModelProduto implements interfProduto{
    
  
    private int idProduto;
    private String produto;
    private double preco;
    private int estoque;
    
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public void cadastrarProduto() {
        
    }

    @Override
    public void alterarProduto() {
        
    }

    @Override
    public void excluirProduto() {
        
    }
    
}
