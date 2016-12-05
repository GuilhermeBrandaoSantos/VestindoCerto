/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelConexaoMysql;
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
public class DAOUsuario {
   
    public List<ModelUsuario> getUsuarios() {
        try {
            ModelConexaoMysql con = new ModelConexaoMysql();
            con.getConexao();
            
            String sql = "select * from usuario order by id;";
            
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            List<ModelUsuario> listaDeUsuarios = new ArrayList<ModelUsuario>();
 
            while (resultado.next()) { 
                ModelUsuario modelUsuario = new ModelUsuario();
                modelUsuario.setId(resultado.getInt("id"));
                modelUsuario.setNome(resultado.getString("nome"));
                modelUsuario.setEmail(resultado.getString("email"));
                modelUsuario.setSenha(resultado.getString("senha"));
 
                listaDeUsuarios.add(modelUsuario);
            }
 
            //Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
 
            return listaDeUsuarios;
 
        } catch (Exception e) { //Se der algum exessão...
            System.out.println(e.getMessage());
            return null;
        }
    }  
   
    public boolean storeUsuario(ModelUsuario modelUsuario) throws SQLException {
        String sql = "";
        sql += "insert into usuario (`nome`, `email`, `senha`)";
        sql += " VALUES ";
        sql += "(?,?,?);";
        
        try {
            ModelConexaoMysql conexao = new ModelConexaoMysql();
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            System.out.println(modelUsuario.getNome());
            stmt.setString(1, modelUsuario.getNome());
            stmt.setString(2, modelUsuario.getEmail());
            stmt.setString(3, modelUsuario.getSenha());

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
