package aula;

public class UsuarioValidadorGerado {
    public static void validar(User obj) {
        if (obj.getName() == null || obj.getName().isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");
        }
    }
}