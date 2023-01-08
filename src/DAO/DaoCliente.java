/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;

/**
 *
 * @author Joshua
 */
public class DaoCliente extends ConexaoMySql {

    public int salvarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_cliente("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone"
                    + ") VALUES ("
                    + "'" + modelCliente.getNome() + "',"
                    + "'" + modelCliente.getEndereco() + "',"
                    + "'" + modelCliente.getBairro() + "',"
                    + "'" + modelCliente.getCidade() + "',"
                    + "'" + modelCliente.getEstado() + "',"
                    + "'" + modelCliente.getCep() + "',"
                    + "'" + modelCliente.getTelefone() + "')"
            );
        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    public boolean excluirClienteDAO(int idCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_cliente WHERE idCliente = '" + idCliente + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_cliente SET "
                    + "nome = '" + modelCliente.getNome() + "',"
                    + "endereco = '" + modelCliente.getEndereco() + "',"
                    + "bairro = '" + modelCliente.getBairro() + "',"
                    + "cidade = '" + modelCliente.getCidade() + "',"
                    + "estado = '" + modelCliente.getEstado() + "',"
                    + "cep = '" + modelCliente.getCep() + "',"
                    + "telefone = '" + modelCliente.getTelefone() + "'"
                    + " WHERE idCliente = '" + modelCliente.getIdCliente() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();;
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public ModelCliente retornarClienteDAO(int idCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idCliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone "
                    + "FROM tb_cliente WHERE idCliente = '" + idCliente + "'"
            );
            while (this.getResultSet().next()) {
                
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setEstado(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getInt(8));
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
    public ModelCliente retornarClienteDAO(String nomeCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idCliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone "
                    + "FROM tb_cliente WHERE nome = '" + nomeCliente + "'"
            );
            while (this.getResultSet().next()) {
                
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setEstado(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getInt(8));
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    public ArrayList<ModelCliente> retornarListaClienteDAO() {
        ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idCliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone "
                    + "FROM tb_cliente;"
            );
            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setEstado(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getInt(8));
                listaModelCliente.add(modelCliente);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelCliente;
    }
    
}
