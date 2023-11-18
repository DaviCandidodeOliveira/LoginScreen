

import java.util.HashMap;
import java.util.Map;

/**
 * A classe login é cria usuarios ficticios para testes
 * @author Davi Candido RA:222222
 */

public class LoginScreen {

    private static Map<String,String> userDatabase;

    /**
     * 
     *  A instância do LoginScreen não requer parâmetros e, ao ser criada, automaticamente cria um banco de dados de usuários, gerando dois registros iniciais.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john","password123");
        userDatabase.put("alice","securepass");
    }

    /**
     * O método login recebe as strings user e password, verificando sua existência no banco de dados.
     * @param O parâmetro user é utilizado como o nome de usuário. 
     * @param enquanto o parâmetro password representa a senha associada.
     * @return O retorno do método é do tipo Boolean e indica se as credenciais fornecidas são válidas, sendo uma maneira de validar os dados recebidos.
     */
    public boolean login(String User, String password) {

        if (userDatabase.containsKey(User)) {
            String storedPassword = userDatabase.get(User);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * O método addUser recebe as strings user e password, e as inclui no HashMap denominado userDatabase
     * @param O parâmetro user representa a string do nome de usuário
     * @param o parâmetro password é a string da senha associada ao usuário.
     * @Return O método não retorna nenhum valor, sendo declarado como void.
     */
    public void addUser(String user, String password) {

        userDatabase.put(user,password);
    }
}