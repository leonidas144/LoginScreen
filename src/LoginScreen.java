import java.util.Map;
import java.util.HashMap;

/**
 * @author Leônidas Alvarenga
 * @version 1.0
 * 
 * Classe para autenticação de usuário.
 */

public class LoginScreen {

	private  Map<String, String> userDatabase; //Simula o usuário (username,password)
	
	/**
	 * Construí uma nova instância da LoginScreen e inicializa o banco.
	 */
	
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	 * Tenta autenticar o usuário com os dados username e password.
	 * 
	 * @param username O nome do usuário para autenticação
	 * @param password A senha do usuário para autenticação
	 * @return {@code true} Se a autenticação for exitosa, {@code false} se falhar.
	 */

	public boolean login(String username, String password) {
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autenticação feita
			}
		}
		return false; // Falha na autenticação
	}
	
	/**
	 * Adiciona um novo usuário. Note que esse método não é recomendado para uso 
	 * em ambiente de produção por questões de segurança.
	 * 
	 * @param username O nome do novo usuário
	 * @param password A senha do novo usuário
	 */
	
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}

}
