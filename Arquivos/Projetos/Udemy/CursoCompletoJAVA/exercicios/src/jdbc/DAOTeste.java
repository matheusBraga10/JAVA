package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		dao.incluir(sql, "João da Silva");
		dao.incluir(sql, "Ana Julia");
		dao.incluir(sql, "Djalma Pereira");
		dao.incluir(sql, "Matheus felipe Braga");
		
		dao.close();
		
		System.out.println("Realizado com sucesso!");
	}
}
