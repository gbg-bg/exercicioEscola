package br.com.proway.senior.escola.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;

public class BoletimControllerTest {

	static BoletimController controller;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202105;
		Boletim boletim = new Boletim(aluno, periodo);
		controller = new BoletimController(boletim);
	}

	@Ignore
	public void testBoletimController() {
	}

	@Test
	public void testAddProva() throws Exception {
		controller.removeTodasProvas();
		controller.addBoletim();
		Materia materia = new Materia();
		Prova prova = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova.setNota(7.0);
		controller.addProva(prova);
		assertEquals(1, controller.getBoletim().getProvas().size());
	}

	@Test
	public void testCalcularMedia() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova primeiraProva = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova segundaProva = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		primeiraProva.setNota(10.0);
		segundaProva.setNota(10.0);
		controller.addProva(primeiraProva);
		controller.addProva(segundaProva);
		assertEquals(10.0, (double) controller.getBoletim().getMedia(), 0.1);
	}

	@Test
	public void testRemoveProva() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova primeiraProva = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova segundaProva = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		primeiraProva.setNota(10.0);
		segundaProva.setNota(10.0);
		controller.addProva(primeiraProva);
		controller.addProva(segundaProva);
		controller.removeProva(1);
		assertEquals(2, controller.getBoletim().getProvas().size());
	}

	@Test
	public void testRemoveProvas() throws Exception {
		Materia materia = new Materia();
		Prova prova = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova.setNota(10.0);
		controller.addProva(prova);
		controller.removeTodasProvas();
		assertFalse(controller.getBoletim().getProvas().size() > 0);
	}

}