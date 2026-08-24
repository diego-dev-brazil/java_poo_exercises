import java.util.List;

public class Marketplace {

    public static Double[] calcularReceita(int estoqueDisponivel, double precoUnitario, List<Integer> pedidos, double taxaPlataforma, double freteFixo
    		,int limiteCaminhao) {
        if (pedidos == null || pedidos.isEmpty()) {
        	System.out.println("Vazio");
        	return null;
        }
        Double[] receita = {0.0,0.0};
        for (Integer pedido : pedidos) {
        	if (pedido == null || pedido <= 0 || pedido > estoqueDisponivel) {
        		continue;
        	}
        	if (estoqueDisponivel == 0) {
        		break;
        	}
        	Double valorbruto = pedido * precoUnitario;
        	valorbruto -= valorbruto * taxaPlataforma;
        	double valorliquido = valorbruto - freteFixo;
        	receita[0] += valorliquido;
        	if (valorliquido <= 0) {
        		continue;
        	}
        	estoqueDisponivel -= pedido;
          	receita[1] += pedido;
        }
        
        return receita; 
    }
}