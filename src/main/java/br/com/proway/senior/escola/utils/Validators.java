package br.com.proway.senior.escola.utils;

/**
 * Utilitarios do sistema
 * 
 * Esta classe eh utilizada para definir metodos que serao utilitarios de diversas
 * partes do sistema.
 * 
 */
public class Validators {
	
	private Validators() {}
	
	/**
	 * Verifica se ha caracteres nao alfabeticos
	 * 
	 * @param verify String a ser verificada
	 * @return boolean 
	 */
	static public boolean onlyValidChars(String verify) {
		return !verify.matches(
				".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
	}
}
