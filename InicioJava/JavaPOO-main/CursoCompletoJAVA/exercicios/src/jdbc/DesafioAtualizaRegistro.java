package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizaRegistro {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo LIKE ?";
		String atualiza = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		System.out.println("Informe o código desejado para alterar o nome de usuário: ");
		String id = scanner.nextLine();
		
		PreparedStatement stmt1 = conexao.prepareStatement(sql); // !
		stmt1.setString(1,  id); // !!
		stmt1.execute(); // !!!
		ResultSet resultado = stmt1.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		if(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
			System.out.println("Informe o novo nome que constará no \ncódigo de número " + codigo + " que tem como nome atual: " + nome);
			
			
			String newName = scanner.nextLine();
			
			stmt1.close();

			PreparedStatement stmt2 = conexao.prepareStatement(atualiza);
			stmt2.setString(1, newName);
			stmt2.setInt(2, codigo);
			stmt2.execute();
			stmt2.executeUpdate(); 
			
			System.out.println("O cadastro de número " + codigo
					+ " foi atualizado para: " + codigo + " - " + newName);
			stmt2.close();
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		conexao.close();
		scanner.close();
	}
}
