/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoVendaProduto;
import java.util.ArrayList;
import model.ModelVendaProduto;

/**
 *
 * @author Joshua
 */
public class ControllerVendaProduto {
    
    private DaoVendaProduto daoVendaProduto = new DaoVendaProduto();
    
    public int salvarVendaProdutoController(ModelVendaProduto ModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(ModelVendaProduto);
    }
    
    public boolean excluirVendaProdutoController(int idVendaProduto) {
        return this.daoVendaProduto.excluirVendaProdutoDAO(idVendaProduto);
    }
    
    public boolean alterarVendaProdutoController(ModelVendaProduto ModelVendaProduto) {
        return this.daoVendaProduto.alterarVendaProdutoDAO(ModelVendaProduto);
    }
    
    public ModelVendaProduto retornarVendaProdutoController(int idVendaProduto) {
        return this.daoVendaProduto.retornarVendaProdutoDAO(idVendaProduto);
    }
    
    public ArrayList<ModelVendaProduto> retornarListaVendaProdutoController() {
        return this.daoVendaProduto.retornarListaVendaProdutoDAO();
    }
    
    /*public boolean salvarVendaProdutosController(ArrayList<ModelVendaProduto> listaModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(listaModelVendaProduto);
    }*/

    public boolean salvarVendaProdutosController(ArrayList<ModelVendaProduto> listaModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(listaModelVendaProduto);
    }
    
}
