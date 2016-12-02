/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.OracleConnection;
/**
 *
 * @author Ricardo Mota
 */
public class ModelConexaoOracle {

    public static void main(String[] args) {
        String sql;

        String server = "localhost";
        String port = "1521";               // Porta TCP padrão do Oracle
        String database = "vestindo_certo";

        // Configuração dos parâmetros de autenticação
        String user = "root";
        String passwd = "";

        try {
            String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + database;

            // Abre-se a conexão com o Banco de Dados
            OracleConnection con = (OracleConnection) DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();

            // Exemplo: cria-se uma tabela no Banco de Dados de Teste
            sql = "CREATE TABLE `filmes` ("
                    + "`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,"
                    + "`titulo` VARCHAR(80) NOT NULL,"
                    + "`ano` INT UNSIGNED,"
                    + "`diretor` VARCHAR(80),"
                    + "PRIMARY KEY (`id`))"
                    + "CHARACTER SET utf8";
            stmt.executeUpdate(sql);

            // Exemplo: inserindo dados na tabela de filmes
            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix', 1999, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix Reloaded', 2003, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix Revolutions', 2003, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);


            // Exemplo: navegando e exibindo os dados dos filmes
            sql = "SELECT `titulo`,`ano` FROM `filmes`";

            // Executa-se a consulta dos campos titulo,ano da tabela de filmes
            ResultSet res = stmt.executeQuery(sql);
            
            int ano;
            String titulo;

            while (res.next()) {
                ano = res.getInt("ano");
                titulo = res.getString("titulo");
                System.out.println("ROW = " + titulo + ": " + ano);
            }

            // Exemplo: excluindo a tabela filmes do Banco de Dados de Teste
            sql = "DROP TABLE `filmes`";
            stmt.executeUpdate(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
