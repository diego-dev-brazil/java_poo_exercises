package aula;

import java.lang.reflect.Field;

public class Validador {
	public static void validar(Object obj) throws IllegalAccessException {
		Class<?> clazz = obj.getClass();
		
		for (Field campo : clazz.getDeclaredFields()) {
			if (campo.isAnnotationPresent(Obrigatorio.class)) {
				campo.setAccessible(true);
				Object valor = campo.get(obj);
				
				if (valor == null || valor.toString().isBlank()) {
					Obrigatorio anotacao = campo.getAnnotation(Obrigatorio.class);
                    throw new IllegalArgumentException(anotacao.mensagem());
				}
			}
			
		}
	}
}
