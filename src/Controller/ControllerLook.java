/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAORoupa;
import Model.ModelRoupa;
import Model.ModelUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class ControllerLook {
    public ModelRoupa gerarLook(ModelRoupa modelRoupa){
        DAORoupa daoRoupa = new DAORoupa();
        ModelRoupa novaRoupa = new ModelRoupa();
        
        novaRoupa = daoRoupa.gerarLook(modelRoupa);
        
        return novaRoupa;
    }
}
