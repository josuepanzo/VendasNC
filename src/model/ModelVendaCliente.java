/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class ModelVendaCliente {
    private ModelVenda modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendaCliente> listaModelVendaCliente;
    
    public ModelVenda getModelVenda() {
        return this.modelVenda;
    }
    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }
    
    public ModelCliente getModelCliente() {
        return this.modelCliente;
    }
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }
    
    public ArrayList<ModelVendaCliente> getModelVendaCliente() {
        return this.listaModelVendaCliente;
    }
    public void setModelVendaCliente(ArrayList<ModelVendaCliente> listaModelVendaCliente) {
        this.listaModelVendaCliente = listaModelVendaCliente;
    }
    
}
