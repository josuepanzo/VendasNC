/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import model.ModelVenda;

/**
 *
 * @author Joshua
 */
public class DaoVenda extends ConexaoMySql {
    
    public int salvarVendaDAO(ModelVenda modelVenda) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_venda("
                    + "idCliente,"
                    + "data_Venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto"
                    + ") VALUES ("
                    + "'" + modelVenda.getIdCliente() + "',"
                    + "'" + modelVenda.getData_Venda() + "',"
                    + "'" + modelVenda.getValor_liquido() + "',"
                    + "'" + modelVenda.getValor_bruto() + "',"
                    + "'" + modelVenda.getDesconto() + "')"
            );
        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    public boolean excluirVendaDAO(int idVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_venda WHERE idVenda = '" + idVenda + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public boolean alterarVendaDAO(ModelVenda modelVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_venda SET "
                    + "idCliente = '" + modelVenda.getIdCliente() + "',"
                    + "data_venda = '" + modelVenda.getData_Venda() + "',"
                    + "valor_liquido = '" + modelVenda.getValor_liquido() + "',"
                    + "valor_bruto = '" + modelVenda.getValor_bruto() + "',"
                    + "desconto = '" + modelVenda.getDesconto() + "'"
                    + " WHERE idVenda = '" + modelVenda.getIdVenda() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();;
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public ModelVenda retornarVendaDAO(int idVenda) {
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idVenda,"
                    + "idCliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto "
                    + "FROM tb_venda WHERE idVenda = '" + idVenda + "'"
            );
            while (this.getResultSet().next()) {
                
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setData_Venda(this.getResultSet().getDate(3));
                modelVenda.setValor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setValor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setDesconto(this.getResultSet().getDouble(6));
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }
    
    public ArrayList<ModelVenda> retornarListaVendaDAO() {
        ArrayList<ModelVenda> listaModelVenda = new ArrayList<>();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idVenda,"
                    + "idCliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto "
                    + "FROM tb_venda;"
            );
            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setData_Venda(this.getResultSet().getDate(3));
                modelVenda.setValor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setValor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setDesconto(this.getResultSet().getDouble(6));
                listaModelVenda.add(modelVenda);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVenda;
    }
    
}
