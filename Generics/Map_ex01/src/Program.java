import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		Map<String, Integer> votosPorCandidato = new HashMap<>();
		String strPath = "/home/diegodevkoga/Documents/temp/formato.csv";
		File path = new File (strPath);
		try (BufferedReader br = new BufferedReader (new FileReader (path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String nomeCandidato = fields[0];
				int votos = Integer.parseInt(fields[1]);
				if (votosPorCandidato.containsKey(nomeCandidato)) {
					votosPorCandidato.put(nomeCandidato, votosPorCandidato.get(nomeCandidato) + votos);
				}else {
				votosPorCandidato.put(nomeCandidato, votos);
				}
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String key : votosPorCandidato.keySet()) {
			System.out.println("\nCandidato: " + key);
			System.out.println("\nVotos: " + votosPorCandidato.get(key));
		}
	}
}
