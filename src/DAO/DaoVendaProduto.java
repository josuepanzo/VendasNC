/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendaProduto;

/**
 *
 * @author Joshua
 */
public class DaoVendaProduto extends ConexaoMySql {

    public int salvarVendaProdutoDAO(ModelVendaProduto modelVendaProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_venda_produto("
                    + "idVendaProduto,"
                    + "idVenda,"
                    + "idProduto,"
                    + "preco_produto,"
                    + "qtd_produto"
                    + ") VALUES ("
                    + "'" + modelVendaProduto.getIdVendaProduto() + "',"
                    + "'" + modelVendaProduto.getIdVenda() + "',"
                    + "'" + modelVendaProduto.getIdProduto() + "',"
                    + "'" + modelVendaProduto.getPreco_produto() + "',"
                    + "'" + modelVendaProduto.getQtd_produto() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirVendaProdutoDAO(int idVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_venda_produto WHERE idVenda = '" + idVendaProduto + "'"
                    // "DELETE FROM tb_venda_produto WHERE idVendaProduto = '" + idVendaProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarVendaProdutoDAO(ModelVendaProduto modelVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_venda_produto SET "
                    + "idVendaProduto = '" + modelVendaProduto.getIdVendaProduto() + "',"
                    + "idVenda = '" + modelVendaProduto.getIdVenda() + "',"
                    + "idProduto = '" + modelVendaProduto.getIdProduto() + "',"
                    + "preco_produto = '" + modelVendaProduto.getPreco_produto() + "',"
                    + "qtd_produto = '" + modelVendaProduto.getQtd_produto() + "'"
                    + " WHERE idVendaProduto = '" + modelVendaProduto.getIdVendaProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();;
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelVendaProduto retornarVendaProdutoDAO(int idVendaProduto) {
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idVendaProduto,"
                    + "idVenda,"
                    + "idProduto,"
                    + "preco_produto,"
                    + "qtd_produto "
                    + "FROM tb_venda_produto WHERE idVendaProduto = '" + idVendaProduto + "'"
            );
            while (this.getResultSet().next()) {

                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(2));
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(3));
                modelVendaProduto.setPreco_produto(this.getResultSet().getDouble(4));
                modelVendaProduto.setQtd_produto(this.getResultSet().getInt(5));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProduto;
    }

    public ArrayList<ModelVendaProduto> retornarListaVendaProdutoDAO() {
        ArrayList<ModelVendaProduto> listaModelVendaProduto = new ArrayList<>();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idVendaProduto,"
                    + "idVenda,"
                    + "idProduto,"
                    + "preco_produto,"
                    + "qtd_produto "
                    + "FROM tb_venda_produto;"
            );
            while (this.getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendaProduto.setIdVenda(this.getResultSet().getInt(2));
                modelVendaProduto.setIdProduto(this.getResultSet().getInt(3));
                modelVendaProduto.setPreco_produto(this.getResultSet().getDouble(4));
                modelVendaProduto.setQtd_produto(this.getResultSet().getInt(5));
                listaModelVendaProduto.add(modelVendaProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendaProduto;
    }

    public boolean salvarVendaProdutoDAO(ArrayList<ModelVendaProduto> listaModelVendaProduto) {
        try {
            this.conectar();
            int cont = listaModelVendaProduto.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL("INSERT INTO tb_venda_produto("
                        + "idVenda,"
                        + "idProduto,"
                        + "preco_produto,"
                        + "qtd_produto"
                        + ") VALUES ("
                        + "'" + listaModelVendaProduto.get(i).getIdVenda() + "',"
                        + "'" + listaModelVendaProduto.get(i).getIdProduto() + "',"
                        + "'" + listaModelVendaProduto.get(i).getPreco_produto() + "',"
                        + "'" + listaModelVendaProduto.get(i).getQtd_produto() + "')"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
