/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoVenda;
import java.util.ArrayList;
import model.ModelVenda;

/**
 *
 * @author Joshua
 */
public class ControllerVenda {
    
    private DaoVenda daoVenda = new DaoVenda();
    
    public int salvarVendaController(ModelVenda ModelVenda) {
        return this.daoVenda.salvarVendaDAO(ModelVenda);
    }
    
    public boolean excluirVendaController(int idVenda) {
        return this.daoVenda.excluirVendaDAO(idVenda);
    }
    
    public boolean alterarVendaController(ModelVenda ModelVenda) {
        return this.daoVenda.alterarVendaDAO(ModelVenda);
    }
    
    public ModelVenda retornarVendaController(int idVenda) {
        return this.daoVenda.retornarVendaDAO(idVenda);
    }
    
    public ArrayList<ModelVenda> retornarListaVendaController() {
        return this.daoVenda.retornarListaVendaDAO();
    }
    
}
