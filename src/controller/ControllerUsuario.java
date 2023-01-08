/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelUsuario;
import DAO.DaoUsuario;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsuario = new DaoUsuario();
    
    public int salvarUsuarioController(ModelUsuario ModelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(ModelUsuario);
    }
    
    public boolean excluirUsuarioController(int idUsuario) {
        return this.daoUsuario.excluirUsuarioDAO(idUsuario);
    }
    
    public boolean alterarUsuarioController(ModelUsuario ModelUsuario) {
        return this.daoUsuario.alterarUsuarioDAO(ModelUsuario);
    }
    
    public ModelUsuario retornarUsuarioController(int idUsuario) {
        return this.daoUsuario.retornarUsuarioDAO(idUsuario);
    }
    
    public ModelUsuario getUsuarioController(String login) {
        return this.daoUsuario.getUsuarioDAO(login);
    }
    
    public ArrayList<ModelUsuario> retornarListaUsuarioController() {
        return this.daoUsuario.retornarListaUsuarioDAO();
    }

    public boolean getValidarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.getValidarUsuarioController(modelUsuario);
    }
    
}
