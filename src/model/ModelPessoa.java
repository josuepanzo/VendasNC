/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Joshua
 */
public class ModelPessoa {
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int telefone;
    
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCep() {
        return this.cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public int getTelefone() {
        return this.telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
