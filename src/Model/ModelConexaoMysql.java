/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//Importações
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo Mota
 */
public class ModelConexaoMysql {
        
    //Status da conexão, para consultas
    private String statusConexao = "Não conectado";
 
    public Connection getConexao() {
        //Atributo para conexão
        Connection conexao = null;
 
        //Começa a tentativa de conexão
        try {
 
            //Designa o driver de conexão padrão para essa conexão:
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
 
            //Seta os parâmetros da conexão ao banco -IMPORTANTE AQUI!!!-
            String servidor = "localhost"; //Caminho de rede do BD
            String schema = "vestindo_certo";   //Nome do schema que será usado
 
            //URL para o driver JDBC:
            String url = "jdbc:mysql://" + servidor + "/" + schema;
 
            //Parâmetros da conexão (usuário e senha)
            //Atenção: COLOQUE AQUI O SEU USUÁRIO E A SUA SENHA!
            String usuario = "root";    //Usuário da base, criado anteriormente
            String senha = "";   //Senha do usuário
 
            //seta a conexão:
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
 
            //Testando a conexão
            if (conexao != null) {   //Se aconexão for ok, ela não é nula...
                //Troca o status da conexão
                statusConexao = ("Conetado");
            } else {
                statusConexao = ("Não conectado");
            }
 
            //retorna a conexão para quem for utiliza-la
            return conexao;
 
        } catch (ClassNotFoundException e) {  //Caso não encontre o driver de conexão
            JOptionPane.showMessageDialog(null, "Driver de conexão não encontrado.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (SQLException e) { //Caso não consiga conectar
            JOptionPane.showMessageDialog(null, "Falha na conexão: ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
 
    //Retorna o status da conexão
    public String getStatusConexao() {
        return statusConexao;
    }
 
    //Método para fechar (encerrar) a conexão
    public boolean FechaConexao() {
        try {
            getConexao().close(); //Fecha
            statusConexao = "Conexão fechada"; //Atualiza o status
            return true; //Retorna verdadeiro = conseguiu fechar!
        } catch (SQLException e) {
            //Se der algum erro, imprime
            System.out.println(e.getMessage());
            return false;
        }
    }
 
    //caso precise reiniciar sua conexão
    public Connection ReiniciaConexao() {
        FechaConexao(); //Fecha
        return getConexao(); //Abre e retorna
    }
    
}
