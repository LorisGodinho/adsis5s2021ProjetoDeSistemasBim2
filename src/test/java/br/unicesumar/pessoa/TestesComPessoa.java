package br.unicesumar.pessoa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesComPessoa {

	@Test
	public void testarPapelDuplo() {
		Pessoa f�sica = new F�sica("Marcello Erick Bonfim", "910.822.570-28");
		f�sica.setProfessor(new Professor());
		f�sica.setAluno(new Aluno());
	}

}
