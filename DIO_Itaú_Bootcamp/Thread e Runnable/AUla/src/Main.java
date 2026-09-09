import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Integer> numbers = new ArrayList<>();
	
	public static void main(String[] args) {
		Runnable inc = () -> {
			for (int i = 0; i < 100_000; i++) {
				numbers.add(i);
			}
		};
		Runnable dec = () -> {
			for (int i = 0; i < 100_000; i++) {
				numbers.add(i);
			}
		};
		Runnable pec = () -> {
			for (int i = 0; i < 100_000; i++) {
				numbers.add(i);
			}
		};
		new Thread(inc).start();
		new Thread(dec).start();
		new Thread(pec).start();
	}

}
