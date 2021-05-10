package br.com.proway.senior.escola.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.persistence.ArrayListPersistenceBoletim;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class BoletimDaoTest {

	static BoletimDao DAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testRemoveAll() {
		ArrayListPersistenceBoletim db = new ArrayListPersistenceBoletim();
		Aluno aluno = new Aluno();
		Boletim boletim = new Boletim(aluno, 1);
		db.add(boletim);
		db.add(boletim);
		db.removeAll();
		assertFalse(db.getAll().size() > 0);
	}

	@Test
	public void testRemove() {
		ArrayListPersistenceBoletim db = new ArrayListPersistenceBoletim();
		Aluno aluno = new Aluno();
		Boletim boletim = new Boletim(aluno, 1);
		db.add(boletim);
		db.remove(1);
		assertEquals(1, (int) db.getAll().size());
	}

	@Test
	public void testAdd() {
		ArrayListPersistenceBoletim db = new ArrayListPersistenceBoletim();
		Aluno aluno = new Aluno();
		Boletim boletim = new Boletim(aluno, 1);
		db.add(boletim);
		assertEquals(1, (int) db.getAll().size());
	}

	@Test
	public void testGet() {
		ArrayListPersistenceBoletim db = new ArrayListPersistenceBoletim();
		assertNotNull(db.getAll());
	}

}
