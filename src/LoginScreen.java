import java.util.Map;
import java.util.HashMap;

/**
 * @author Le�nidas Alvarenga
 * @version 1.0
 * 
 * Classe para autentica��o de usu�rio.
 */

public class LoginScreen {

	private  Map<String, String> userDatabase; //Simula o usu�rio (username,password)
	
	/**
	 * Constru� uma nova inst�ncia da LoginScreen e inicializa o banco.
	 */
	
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	 * Tenta autenticar o usu�rio com os dados username e password.
	 * 
	 * @param username O nome do usu�rio para autentica��o
	 * @param password A senha do usu�rio para autentica��o
	 * @return {@code true} Se a autentica��o for exitosa, {@code false} se falhar.
	 */

	public boolean login(String username, String password) {
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autentica��o feita
			}
		}
		return false; // Falha na autentica��o
	}
	
	/**
	 * Adiciona um novo usu�rio. Note que esse m�todo n�o � recomendado para uso 
	 * em ambiente de produ��o por quest�es de seguran�a.
	 * 
	 * @param username O nome do novo usu�rio
	 * @param password A senha do novo usu�rio
	 */
	
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}

}
