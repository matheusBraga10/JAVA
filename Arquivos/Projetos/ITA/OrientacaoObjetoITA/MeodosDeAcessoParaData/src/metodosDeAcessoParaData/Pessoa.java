package metodosDeAcessoParaData;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private FormataDataEmSignos formataDataEmSignos;
	private LocalDate dataDeNascimento;
	
	public Pessoa(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		final LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(getDataDeNascimento(), dataAtual);
		return periodo.getYears();
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public FormataDataEmSignos getFormataDataEmSignos() {
		return formataDataEmSignos;
	}
	
	
	
}
