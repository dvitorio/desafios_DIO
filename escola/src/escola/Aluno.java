package escola;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private Date dataNascimento;
	
	
	//Constructor
	public Aluno() {
	}
	
	//Getters and setters
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//método privado
	public void realizarAvaliacao() {
		
	}



}
