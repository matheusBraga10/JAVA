package formasDeTratamento;

public class Autoridade {
	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = formatadorNome;
	}
	
	public String getTratamento() {
		return formatadorNome.formatarNome(nome, sobrenome);
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public FormatadorNome getFormatadorNome() {
		return formatadorNome;
	}
	
	
	
}
