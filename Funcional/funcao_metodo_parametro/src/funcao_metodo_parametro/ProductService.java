package funcao_metodo_parametro;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
	public Double somaFIltrada (List<Product> List, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : List) {
			if(criteria.test(p)) {
				sum += p.price;
			}
		}
		return sum;
	}
}
