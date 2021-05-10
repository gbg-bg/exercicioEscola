package br.com.proway.senior.escola.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.escola.persistence.ArrayListPersistence;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceBoletim;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaDaoTest {

	static ProvaDao DAO;
	
	@Ignore
	public void testProvaDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAll() {
		ArrayListPersistenceProva db = new ArrayListPersistenceProva();
		Materia materia = new Materia();
		Aluno aluno = new Aluno();
		Prova prova = new Prova(1, aluno, materia);
		db.add(prova);
		db.add(prova);
		db.removeAll();
		assertFalse(db.getAll().size() > 0);
	}
	
	@Test
	public void testRemove() {
		ArrayListPersistenceProva db = new ArrayListPersistenceProva();
		Materia materia = new Materia();
		Aluno aluno = new Aluno();
		Prova prova = new Prova(1, aluno, materia);
		db.add(prova);
		db.remove(1);
		assertEquals(1, (int) db.getAll().size());
	}
	
	@Test
	public void testAdd() {
		ArrayListPersistenceProva db = new ArrayListPersistenceProva();
		Materia materia = new Materia();
		Aluno aluno = new Aluno();
		Prova prova = new Prova(1, aluno, materia);
		db.add(prova);
		assertEquals(1, (int) db.getAll().size());
	}

	@Test
	public void testGet() {
		ArrayListPersistenceProva db = new ArrayListPersistenceProva();
		assertNotNull(db.getAll());
	}

}
