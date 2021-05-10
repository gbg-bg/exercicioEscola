package br.com.proway.senior.escola.model;

import java.util.ArrayList;

/**
 * Redefine as {@link Prova}s de um {@link Aluno}.
 * 
 * O boletim possui uma lista de {@link Prova}s e eh referente a um periodo de um
 * {@link Aluno}. Para cada periodo serah calculada a media das provas que resulta
 * na nota do Boletim.
 * 
 */
public class Boletim {

	private Integer id;
	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim serah criado a partir de um aluno e um periodo. Conforme as provas
	 * serao adicionadas, realiza-se o calculo atualizado da media.
	 * 
	 * @param aluno
	 * @param periodo
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}
	
	/**
	 * Id do Boletim
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * Aluno do boletim
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * PerÃ­odo no formato YYYYMM
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Retorna a mediaS das provas atualizada.
	 * 
	 * @return
	 */
	public Double getMedia() {
		return media;
	}
	
	/**
	 * Retorna todas as provas.
	 * 
	 * @return ArrayList<Prova>
	 */
	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	public void setMedia(double media) {
		this.media = media;		
	}

	public void resetProvas() {
		this.provas = new ArrayList<Prova>();
	}
}
