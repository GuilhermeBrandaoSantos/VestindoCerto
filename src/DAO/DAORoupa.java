/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelConexaoMysql;
import Model.ModelRoupa;
import Model.ModelUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author terced-ricardoh
 */
public class DAORoupa {
    
    public ModelRoupa gerarLook(ModelRoupa modelRoupa) {
        try {
            ModelConexaoMysql con = new ModelConexaoMysql();
            con.getConexao();
            
            String sql = (
                            "select * \n" +
                            "from roupa\n" +
                            "inner join clima on roupa.fk_clima = clima.id\n" +
                            "inner join evento on roupa.fk_evento = evento.id\n" +
                            "inner join local on roupa.fk_local = local.id\n" +
                            "inner join tipo on roupa.fk_tipo = tipo.id\n" +
                            "where roupa.fk_tipo = "+modelRoupa.getFkTipo()+" "
                            + "and roupa.fk_clima = "+modelRoupa.getFkClima()+" "
                            + "and roupa.fk_evento = "+modelRoupa.getFkEvento()+" "
                            + "and roupa.fk_local = "+modelRoupa.getFkLocal()+" "
                            + "LIMIT 1;"
                        );
            
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            ModelRoupa novaRoupa = new ModelRoupa();
 
            while (resultado.next()) { 
                novaRoupa.setId(resultado.getInt("id"));
                novaRoupa.setImagem(resultado.getString("imagem"));
                novaRoupa.setFkClima(resultado.getInt("fk_clima"));
                novaRoupa.setFkEvento(resultado.getInt("fk_evento"));
                novaRoupa.setFkLocal(resultado.getInt("fk_local"));
                novaRoupa.setFkTipo(resultado.getInt("fk_Tipo"));
            }
 
            //Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
 
            return novaRoupa;
 
        } catch (Exception e) { //Se der algum exessão...
            System.out.println(e.getMessage());
            return null;
        }
    }  

    
    
    public boolean storeRoupa(ModelRoupa roupa) throws SQLException {
        String sql = "";
        sql += "insert into roupa (`imagem`, `fk_clima`, `fk_evento`, `fk_local`, `fk_tipo`)";
        sql += " VALUES ";
        sql += "(?,?,?,?,?);";
        
        try {
            ModelConexaoMysql conexao = new ModelConexaoMysql();
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            stmt.setString(1, roupa.getImagem());
            stmt.setInt(2, roupa.getFkClima());
            stmt.setInt(3, roupa.getFkEvento());
            stmt.setInt(4, roupa.getFkLocal());
            stmt.setInt(5, roupa.getFkTipo());

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
