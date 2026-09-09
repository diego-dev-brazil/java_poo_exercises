package aula;

import java.io.PrintWriter;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class ValidadorProcessor extends AbstractProcessor{

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (Element elemento : roundEnv.getElementsAnnotatedWith(Obrigatorio.class)) {
			VariableElement campo = (VariableElement) elemento;
			
			if (campo.asType().getKind().isPrimitive()) {
				processingEnv.getMessager().printMessage(
						Diagnostic.Kind.ERROR, 
						"A anotação @Obrigatorio não pode ser usada em tipos primitivos como " + campo.asType(),
						 campo);
				return true;
			}
			TypeElement classePai = (TypeElement) campo.getEnclosingElement();
            gerarClasseValidadora(classePai, campo);
		}
		
		return true;
	}
	
	private void gerarClasseValidadora(TypeElement classe, VariableElement campo) {
        String nomePacote = processingEnv.getElementUtils().getPackageOf(classe).toString();
        String nomeClasseOriginal = classe.getSimpleName().toString();
        String nomeNovaClasse = nomeClasseOriginal + "ValidadorGerado";
        String nomeCampo = campo.getSimpleName().toString();
        
        Obrigatorio anotacao = campo.getAnnotation(Obrigatorio.class);
        String mensagem = anotacao.mensagem();

        try {
            JavaFileObject arquivoFonte = processingEnv.getFiler()
                .createSourceFile(nomePacote + "." + nomeNovaClasse);

            try (PrintWriter out = new PrintWriter(arquivoFonte.openWriter())) {
                out.println("package " + nomePacote + ";");
                out.println();
                out.println("public class " + nomeNovaClasse + " {");
                out.println("    public static void validar(" + nomeClasseOriginal + " obj) {");
                // Gera um if comum que lê o método getter, sem Reflection lenta:
                out.println("        if (obj.get" + capitalizar(nomeCampo) + "() == null || obj.get" + capitalizar(nomeCampo) + "().isBlank()) {");
                out.println("            throw new IllegalArgumentException(\"" + mensagem + "\");");
                out.println("        }");
                out.println("    }");
                out.println("}");
            }
        } catch (Exception e) {
            // Ignora se o arquivo já foi gerado na rodada anterior
        }
    }
	
	private String capitalizar(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
