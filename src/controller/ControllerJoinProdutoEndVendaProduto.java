/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOJoinProdutoEndVendaProduto;
import java.util.ArrayList;
import model.ModelJoinProdutoEndVendaProduto;

/**
 *
 * @author Joshua
 */
public class ControllerJoinProdutoEndVendaProduto {
    private DAOJoinProdutoEndVendaProduto dAOJoinProdutoEndVendaProduto = new DAOJoinProdutoEndVendaProduto();
    
    public ArrayList<ModelJoinProdutoEndVendaProduto> getListaJoinProdutoEndVendaProdutoController(int idVenda) {
        return this.dAOJoinProdutoEndVendaProduto.getListaJoinProdutoEndVendaProdutoDAO(idVenda);
    }
    
}
