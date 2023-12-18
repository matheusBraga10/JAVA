package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexao {
    public static void main(String[] args) {
        Connection connect = null;
        try{

            connect = DriverManager.getConnection("jdbc:sqlite:teste.db");
            Statement statement = connect.createStatement();
            statement.setQueryTimeout(50);
            
            statement.executeUpdate("DROP TABLE if exists person");
            statement.executeUpdate("CREATE TABLE person (id INTEGER, name STRING)");
            statement.executeUpdate("INSERT INTO person VALUES(1, 'leo')");
            statement.executeUpdate("INSERT INTO person VALUES(2, 'yui')");
            ResultSet rsPerson = statement.executeQuery("SELECT * FROM person");
            while(rsPerson.next()){
                System.out.println("id: " + rsPerson.getInt("id") + " | Nome: " + rsPerson.getString("name"));
            }
        } 
        
        catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        }
        finally {
            if(connect != null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    // TODO Auto-generated catch block
                    ex.printStackTrace();
                }
            }
        }
    }
}