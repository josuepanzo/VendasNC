/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoCliente;
import java.util.ArrayList;
import model.ModelCliente;

/**
 *
 * @author Joshua
 */
public class ControllerCliente {
    private DaoCliente daoCliente = new DaoCliente();
    
    public int salvarClienteController(ModelCliente ModelCliente) {
        return this.daoCliente.salvarClienteDAO(ModelCliente);
    }
    
    public boolean excluirClienteController(int idCliente) {
        return this.daoCliente.excluirClienteDAO(idCliente);
    }
    
    public boolean alterarClienteController(ModelCliente ModelCliente) {
        return this.daoCliente.alterarClienteDAO(ModelCliente);
    }
    
    public ModelCliente retornarClienteController(int idCliente) {
        return this.daoCliente.retornarClienteDAO(idCliente);
    }
    
    public ModelCliente retornarClienteController(String nomeCliente) {
        return this.daoCliente.retornarClienteDAO(nomeCliente);
    }
    
    public ArrayList<ModelCliente> retornarListaClienteController() {
        return this.daoCliente.retornarListaClienteDAO();
    }
    
}
