/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Joshua
 */
public class DaoProduto extends ConexaoMySql {

    /**
     * SALVAR UM PRODUTO NO BANCO DE DADOS
     *
     * @param ModelProduto
     * @return int
     */
    public int salvarProdutoDAO(ModelProduto ModelProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_produto("
                    + "produto,"
                    + "preco,"
                    + "estoque"
                    + ") VALUES ("
                    + "'" + ModelProduto.getProduto() + "',"
                    + "'" + ModelProduto.getPreco() + "',"
                    + "'" + ModelProduto.getEstoque() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * EXCLUIR UM PRODUTO NO BANCO DE DADOS
     *
     * @param idProduto
     * @return boolean
     */
    public boolean excluirProdutDAO(int idProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_produto WHERE idProduto = '" + idProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * ATUALIZAR PRODUTO NO BANCO DE DADOS
     *
     * @param ModelProduto
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProduto ModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_produto SET "
                    + "produto = '" + ModelProduto.getProduto() + "',"
                    + "preco = '" + ModelProduto.getPreco() + "',"
                    + "estoque = '" + ModelProduto.getEstoque() + "'"
                    + " WHERE idProduto = '" + ModelProduto.getIdProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();;
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * RETORNAR UM PRODUTO PELO CÓDIGO
     *
     * @param idProduto
     * @return modelProduto
     */
    public ModelProduto retornarProdutoDAO(int idProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idProduto,"
                    + "produto,"
                    + "preco,"
                    + "estoque "
                    + "FROM tb_produto WHERE idProduto = '" + idProduto + "'"
            );
            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProduto(this.getResultSet().getString(2));
                modelProduto.setPreco(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    public ModelProduto retornarProdutoDAO(String nomeProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idProduto,"
                    + "produto,"
                    + "preco,"
                    + "estoque "
                    + "FROM tb_produto WHERE produto = '" + nomeProduto + "'"
            );
            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProduto(this.getResultSet().getString(2));
                modelProduto.setPreco(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    public ArrayList<ModelProduto> retornarListaProdutosDAO() {
        ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idProduto,"
                    + "produto,"
                    + "preco,"
                    + "estoque "
                    + "FROM tb_produto;"
            );
            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProduto(this.getResultSet().getString(2));
                modelProduto.setPreco(this.getResultSet().getDouble(3));
                modelProduto.setEstoque(this.getResultSet().getInt(4));
                listaModelProduto.add(modelProduto);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return listaModelProduto;
    }
    
    /**
     * ALTERAR O ESTOQUE DO PRODUTO
     * @param listaModelProduto
     * @return 
     */
    public boolean alterarEstoqueProduto(ArrayList<ModelProduto> listaModelProduto) {
        try {
            this.conectar();
            for (int i = 0; i < listaModelProduto.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tb_produto SET "
                        + "estoque = '" + listaModelProduto.get(i).getEstoque() + "'"
                        + " WHERE idProduto = '" + listaModelProduto.get(i).getIdProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();;
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
