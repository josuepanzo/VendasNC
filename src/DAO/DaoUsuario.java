/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelUsuario;

/**
 *
 * @author Joshua
 */
public class DaoUsuario extends ConexaoMySql {

    public int salvarUsuarioDAO(ModelUsuario ModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_usuario("
                    + "nome,"
                    + "email,"
                    + "senha"
                    + ") VALUES ("
                    + "'" + ModelUsuario.getNomeUsuario() + "',"
                    + "'" + ModelUsuario.getEmailUsuario() + "',"
                    + "'" + ModelUsuario.getSenhaUsuario() + "')"
            );
        } catch (Exception e) {
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirUsuarioDAO(int idUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_usuario WHERE idUsuario = '" + idUsuario + "'"
            );
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarUsuarioDAO(ModelUsuario ModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_usuario SET "
                    + "nome = '" + ModelUsuario.getNomeUsuario() + "',"
                    + "email = '" + ModelUsuario.getEmailUsuario() + "',"
                    + "senha = '" + ModelUsuario.getSenhaUsuario() + "'"
                    + " WHERE idUsuario = '" + ModelUsuario.getIdUsuario() + "'"
            );
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelUsuario retornarUsuarioDAO(int idUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idUsuario,"
                    + "nome,"
                    + "email,"
                    + "senha "
                    + "FROM tb_usuario WHERE idUsuario = '" + idUsuario + "'"
            );
            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setEmailUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
            }
        } catch (SQLException e) {

        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    public ArrayList<ModelUsuario> retornarListaUsuarioDAO() {
        ArrayList<ModelUsuario> listaModelUsuario = new ArrayList<>();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idUsuario,"
                    + "nome,"
                    + "email,"
                    + "senha "
                    + "FROM tb_usuario;"
            );
            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setEmailUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
                listaModelUsuario.add(modelUsuario);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return listaModelUsuario;
    }

    public boolean getValidarUsuarioController(ModelUsuario modelUsuario) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idUsuario,"
                    + "nome,"
                    + "email,"
                    + "senha "
                    + "FROM tb_usuario WHERE email = '" + modelUsuario.getEmailUsuario() + "' AND senha = '" + modelUsuario.getSenhaUsuario() + "'"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * RETORNAR O NOME CAIXA E STATUS NO MENU PRINCIPAL
     *
     * @param login
     * @return
     */
    public ModelUsuario getUsuarioDAO(String login) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "idUsuario,"
                    + "nome,"
                    + "email,"
                    + "senha "
                    + "FROM tb_usuario WHERE email = '" + login + "'"
            );
            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setEmailUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
            }
        } catch (SQLException e) {

        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

}
