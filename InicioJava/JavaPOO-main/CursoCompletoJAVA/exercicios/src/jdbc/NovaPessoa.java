package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = scanner.next();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?);"; // Usar esse método para evitar o SQLinjection
		PreparedStatement stmt = conexao.prepareStatement(sql); // !
		stmt.setString(1, nome); // !!
		stmt.execute(); // !!!
		
		System.out.println("Pessoa incluida com sucesso!");
		
		scanner.close();
	}
}
