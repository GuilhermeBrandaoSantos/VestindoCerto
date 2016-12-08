/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelConexaoMysql;
import Model.ModelRoupa;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author terced-ricardoh
 */
public class DAORoupa {
    public boolean storeRoupa(ModelRoupa roupa) throws SQLException {
        String sql = "";
        sql += "insert into roupa (`imagem`, `fk_clima`, `fk_evento`, `fk_local`)";
        sql += " VALUES ";
        sql += "(?,?,?,?);";
        
        try {
            ModelConexaoMysql conexao = new ModelConexaoMysql();
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            stmt.setString(1, roupa.getImagem());
            stmt.setInt(2, roupa.getFkClima());
            stmt.setInt(3, roupa.getFkEvento());
            stmt.setInt(4, roupa.getFkLocal());

            stmt.addBatch();
            System.out.println(sql);
            
            stmt.executeBatch();
            stmt.close();
            conexao.getConexao().close();
            return true;
        }catch(SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
            return false;
        }
    }
}
