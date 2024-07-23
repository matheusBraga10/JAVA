package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		String delete = "DELETE FROM pessoas WHERE codigo = ?";
		
		System.out.println("Entre com o numero do código que será removido: ");
		String id = scanner.nextLine();
		PreparedStatement stmt = conexao.prepareStatement(delete);
		stmt.setString(1, id);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa exluida com sucesso!");
		} else {
			System.out.println("Nada feito");
		}
		
		scanner.close();
		conexao.close();
	}
}
