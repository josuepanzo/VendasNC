/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVenda;
import model.ModelVendaCliente;

/**
 *
 * @author Joshua
 */
public class DAOVendaCliente extends ConexaoMySql {

    public ArrayList<ModelVendaCliente> retornarListaVendaClienteDAO() {
        ArrayList<ModelVendaCliente> listaModelVendaCliente = new ArrayList<>();
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendaCliente modelVendaCliente = new ModelVendaCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_venda.idVenda,"
                    + "tb_venda.idCliente,"
                    + "tb_venda.data_venda,"
                    + "tb_venda.valor_liquido,"
                    + "tb_venda.valor_bruto,"
                    + "tb_venda.desconto,"
                    + "tb_cliente.idCliente,"
                    + "tb_cliente.nome,"
                    + "tb_cliente.endereco,"
                    + "tb_cliente.bairro,"
                    + "tb_cliente.cidade,"
                    + "tb_cliente.estado,"
                    + "tb_cliente.cep,"
                    + "tb_cliente.telefone"          
                    + " FROM "
                    + " tb_venda INNER JOIN tb_cliente "
                    + "ON tb_cliente.idCliente = tb_venda.idCliente; "
                    + ";"
            );
            while (this.getResultSet().next()) {
                /**
                 * DADOS DA VENDA
                 */
                modelVenda = new ModelVenda();
                modelCliente = new ModelCliente();
                modelVendaCliente = new ModelVendaCliente();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setData_Venda(this.getResultSet().getDate(3));
                modelVenda.setValor_liquido(this.getResultSet().getDouble(4));
                modelVenda.setValor_bruto(this.getResultSet().getDouble(5));
                modelVenda.setDesconto(this.getResultSet().getDouble(6));
                /**
                 * DADOS DO CLIENTE
                 */
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setNome(this.getResultSet().getString(8));
                modelCliente.setEndereco(this.getResultSet().getString(9));
                modelCliente.setBairro(this.getResultSet().getString(10));
                modelCliente.setCidade(this.getResultSet().getString(11));
                modelCliente.setEstado(this.getResultSet().getString(12));
                modelCliente.setCep(this.getResultSet().getString(13));
                modelCliente.setTelefone(this.getResultSet().getInt(14));

                modelVendaCliente.setModelVenda(modelVenda);
                modelVendaCliente.setModelCliente(modelCliente);

                listaModelVendaCliente.add(modelVendaCliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendaCliente;
    }

}
