/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAORoupa;
import Model.ModelRoupa;
import java.sql.SQLException;

/**
 *
 * @author internet
 */
public class ControllerRoupa {
    public boolean storeRoupa(ModelRoupa roupa) throws SQLException{
        DAORoupa daoRoupa = new DAORoupa();
        boolean controle = daoRoupa.storeRoupa(roupa);
        return controle;
    }
}
