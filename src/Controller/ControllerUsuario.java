/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUsuario;
import Model.ModelUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class ControllerUsuario {
    
    public List<ModelUsuario> getUsuario(){
        DAOUsuario DAOusuario = new DAOUsuario();
        
        List<ModelUsuario> listUsuarios = new ArrayList<ModelUsuario>();
        listUsuarios = DAOusuario.getUsuarios();
        
        return listUsuarios;
    }
    
    public boolean storeUsuario(String dados[]) throws SQLException{
        ModelUsuario modelUsuario = new ModelUsuario();
        DAOUsuario DAOUsuario = new DAOUsuario();
        
        modelUsuario.setNome(dados[0]);
        modelUsuario.setEmail(dados[1]);
        modelUsuario.setSenha(dados[2]);
        //System.out.println(modelUsuario.getNome());
        
        return DAOUsuario.storeUsuario(modelUsuario);
    }
    
    public boolean Login(String email, String senha){
        boolean controle = false;
        List<ModelUsuario> listUsuarios = this.getUsuario();
        
        for (ModelUsuario usuarioLocal : listUsuarios){
            if(email.equals(usuarioLocal.getEmail()) && senha.equals(usuarioLocal.getSenha())){
                controle = true;
                break;
            }
            //System.out.println("EmailDB: "+usuarioLocal.getEmail()+" | SenhaDB: "+usuarioLocal.getSenha());
            //System.out.println("EmailTX: "+email+" | SenhaTX: "+senha);
        }
        //System.out.println(controle);
        
        return controle;
    }
}
