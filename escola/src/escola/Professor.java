package escola;

public class Professor extends Pessoa {
	
	private String formacaoAcademica;
	private Double salario;
	
	//Construtor padr�o
	public Professor() {
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	//M�todos acessores
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//M�todo privado
	public void aplicarAvaliacao() {
	}

}
