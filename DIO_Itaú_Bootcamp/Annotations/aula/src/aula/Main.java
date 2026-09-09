package aula;

public class Main {
	public static void main(String[] args) {
		try {
		User u = new User("");
		Validador.validar(u);
		}
		 catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
