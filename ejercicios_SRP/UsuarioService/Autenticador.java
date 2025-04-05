package ejercicios_SRP.UsuarioService;

public class Autenticador {
    public boolean autenticar(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }
}