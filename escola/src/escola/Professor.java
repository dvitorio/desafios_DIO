package escola;

public class Professor extends Pessoa {
	
	private String formacaoAcademica;
	private Double salario;
	
	//Construtor padrão
	public Professor() {
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	//Métodos acessores
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//Método privado
	public void aplicarAvaliacao() {
	}

}
