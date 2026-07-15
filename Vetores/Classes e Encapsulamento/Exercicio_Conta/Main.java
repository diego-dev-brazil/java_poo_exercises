import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String menu = """
            SISTEMA BANCÁRIO
            1 - Consultar Saldo
            2 - Consultar Cheque Especial
            3 - Depositar dinheiro
            4 - Sacar dinheiro
            5 - Pagar um boleto
        """;
        Conta conta = new Conta (1200);

        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.print(menu);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.print("Saldo: R$" + conta.getSaldo() + ",00\n");
                    break;
                case 2:
                    System.out.print("Cheque: R$" + conta.getCheque() + ",00\n");
                    break;
                case 3:
                    System.out.print("Infome o valor a ser depositado:\n");
                    int valor = scanner.nextInt();
                    conta.Depositar (valor);
                    break;
                case 4:
                    System.out.print ("Informe valor do saque:\n");
                    valor = scanner.nextInt();
                    conta.Sacar (valor);
                    break;
                case 5:
                    System.out.print ("Informe valor do boleto:\n");
                    valor = scanner.nextInt();
                    conta.PagarBoleto(valor);
                    break;
            }
        }while (option != 0);
        scanner.close();
    }
}