package escola.app;

import escola.Professor;

public class Escola {

	public static void main(String[] args) {
		Professor prof_1 = new Professor(); 
		prof_1.setNome("Daniel Vitorio");
		prof_1.setFormacaoAcademica("Licenciatura em Matemática");
		System.out.print(prof_1.getNome() + "\n");
		System.out.print(prof_1.getFormacaoAcademica() + "\n");
	}

}
