package br.com.proway.senior.escola.controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaControllerTest {

	static Integer periodoPadrao = 202105;
	static ProvaController provaController;
	static Prova prova;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Materia materia = new Materia();
		prova = new Prova(periodoPadrao, aluno, materia);
		provaController = new ProvaController(prova);

	}

	@Ignore
	public void testProvaControllerProva() {
		
	}

	@Test
	public void testAddProva() throws Exception {
		prova.setNota(10.0);
		provaController.addProva();
		assertEquals(0, (int) provaController.get(0).getId());
	}

	@Test
	public void testRemoveProva() throws Exception {
		prova.setNota(10.0);
		ProvaController pprova = new ProvaController(prova);
		pprova.addProva();
		pprova.removeProva();
		assertNull(pprova.get(0));
	}

	@Test
	public void testGet() {
		provaController.addProva();
		assertEquals(0, (int) provaController.get(0).getId());
	}

}