/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelJoinProdutoEndVendaProduto;
import model.ModelProduto;
import model.ModelVendaProduto;
/**
 *
 * @author Joshua
 */
public class DAOJoinProdutoEndVendaProduto extends ConexaoMySql{
    
    /*public ArrayList<ModelJoinProdutoEndVendaProduto> getListaJoinProdutoEndVendaProdutoDAO(int idVenda) {
        ArrayList<ModelJoinProdutoEndVendaProduto> listaJoinProdutoEndVendaProduto = new ArrayList<>();
        ModelJoinProdutoEndVendaProduto modelJoinProdutoEndVendaProduto = new ModelJoinProdutoEndVendaProduto();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_produto.idProduto,"
                    + "tb_produto.estoque,"
                    + "tb_produto.produto,"
                    + "tb_produto.preco,"
                    + "tb_venda_produto.idProduto,"
                    + "tb_venda_produto.idVenda,"
                    + "tb_venda_produto.idVendaProduto,"
                    + "tb_venda_produto.qtd_produto,"
                    + "tb_venda_produto.preco_produto"          
                    + " FROM "
                    + " tb_venda_produto INNER JOIN tb_produto "
                    + "ON tb_produto.idProduto = tb_venda_produto.idProduto; "
                    + "WHERE tb_venda_produto.idVenda = '"+idVenda+"';"
            );
            
            while (this.getResultSet().next()) {
                modelJoinProdutoEndVendaProduto = new ModelJoinProdutoEndVendaProduto();
                modelProduto = new ModelProduto();
                modelVendaProduto = new ModelVendaProduto();
                
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setEstoque(this.getResultSet().getInt(2));
                modelProduto.setProduto(this.getResultSet().getString(3));
                modelProduto.setPreco(this.getResultSet().getDouble(4));
                
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(5));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(6));
                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(7));
                modelVendaProduto.setQtd_produto(this.getResultSet().getInt(8));
                modelVendaProduto.setPreco_produto(this.getResultSet().getDouble(9));
                
                modelJoinProdutoEndVendaProduto.setModelProduto(modelProduto);
                modelJoinProdutoEndVendaProduto.setModelVendaProduto(modelVendaProduto);
                listaJoinProdutoEndVendaProduto.add(modelJoinProdutoEndVendaProduto);
                
            }
            
        } catch (Exception e) {
        } finally {
            this.fecharConexao();
        }
        return listaJoinProdutoEndVendaProduto;
    }*/

    public ArrayList<ModelJoinProdutoEndVendaProduto> getListaJoinProdutoEndVendaProdutoDAO(int idVenda) {
        ArrayList<ModelJoinProdutoEndVendaProduto> listaJoinProdutoEndVendaProduto = new ArrayList<>();
        ModelJoinProdutoEndVendaProduto modelJoinProdutoEndVendaProduto = new ModelJoinProdutoEndVendaProduto();
        ModelProduto modelProduto = new ModelProduto();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_produto.idProduto,"
                    + "tb_produto.estoque,"
                    + "tb_produto.produto,"
                    + "tb_produto.preco,"
                    + "tb_venda_produto.idProduto,"
                    + "tb_venda_produto.idVenda,"
                    + "tb_venda_produto.idVendaProduto,"
                    + "tb_venda_produto.qtd_produto,"
                    + "tb_venda_produto.preco_produto"          
                    + " FROM "
                    + " tb_venda_produto INNER JOIN tb_produto "
                    + "ON tb_produto.idProduto = tb_venda_produto.idProduto "
                    + "WHERE tb_venda_produto.idVenda = '"+idVenda+"';"
            );
            
            while (this.getResultSet().next()) {
                modelJoinProdutoEndVendaProduto = new ModelJoinProdutoEndVendaProduto();
                modelProduto = new ModelProduto();
                modelVendaProduto = new ModelVendaProduto();
                
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setEstoque(this.getResultSet().getInt(2));
                modelProduto.setProduto(this.getResultSet().getString(3));
                modelProduto.setPreco(this.getResultSet().getDouble(4));
                
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(5));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(6));
                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(7));
                modelVendaProduto.setQtd_produto(this.getResultSet().getInt(8));
                modelVendaProduto.setPreco_produto(this.getResultSet().getDouble(9));
                
                modelJoinProdutoEndVendaProduto.setModelProduto(modelProduto);
                modelJoinProdutoEndVendaProduto.setModelVendaProduto(modelVendaProduto);
                listaJoinProdutoEndVendaProduto.add(modelJoinProdutoEndVendaProduto);
                
            }
            
        } catch (Exception e) {
        } finally {
            this.fecharConexao();
        }
        return listaJoinProdutoEndVendaProduto;
    }
    
}
