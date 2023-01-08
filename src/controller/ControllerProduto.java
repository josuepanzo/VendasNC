/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Joshua
 */
public class ControllerProduto {

    private DaoProduto daoProduto = new DaoProduto();

    /**
     * SALVAR PRODUTO CONTROLLER
     *
     * @param ModelProduto
     * @return int
     */
    public int salvarProdutoController(ModelProduto ModelProduto) {
        return this.daoProduto.salvarProdutoDAO(ModelProduto);
    }

    /**
     * EXCLUIR PRODUTO CONTROLLER
     *
     * @param idProduto
     * @return boolean
     */
    public boolean excluirProdutoController(int idProduto) {
        return this.daoProduto.excluirProdutDAO(idProduto);
    }
    
    /**
     * ALTERAR PRODUTO CONTROLLER
     * @param ModelProduto
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProduto ModelProduto) {
        return this.daoProduto.alterarProdutoDAO(ModelProduto);
    }
    
    /**
     * RETORNAR PRODUTO CONTROLLER
     * @param idProduto
     * @return ModelProduto 
     */
    public ModelProduto retornarProdutoController(int idProduto) {
        return this.daoProduto.retornarProdutoDAO(idProduto);
    }
    
    public ModelProduto retornarProdutoController(String nomeProduto) {
        return this.daoProduto.retornarProdutoDAO(nomeProduto);
    }
    
    /**
     * RETORNAR LISTA PRODUTO CONTROLLER
     * @param ModelProduto
     * @return ArrayList 
     */
    public ArrayList<ModelProduto> retornarListaProdutoController() {
        return this.daoProduto.retornarListaProdutosDAO();
    }
    
    /**
     * ALTERANDO O ESTOQUE DO PRODUTO
     * @param listaModelProduto
     * @return 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProduto> listaModelProduto) {
        return daoProduto.alterarEstoqueProduto(listaModelProduto);
    }

}
