import java.util.Scanner;

public class Conta {
    private int saldo;
    private int cheque;
    private int falta;
    private boolean chequefoiusado;
    public Conta (int valor){
        saldo = valor;
        if (valor < 500){
            cheque = 50;
        }
        else{
            cheque = valor/2;
        }
    }
    public int getSaldo(){
        return saldo;
    }
    public int getCheque(){
        if (chequefoiusado){
            System.out.print("Cheque foi utilizado, entre em contato para descobrir se não há pendências");
        }
        return cheque;
    }
    public void Depositar(int valor){
        saldo = saldo + valor;
        System.out.print("Depósito de R$" + valor + ",00 realizado com sucesso");
        if (falta > 0){
            saldo = saldo - falta;
            System.out.print("O valor de R$" + falta + ",00 foi debitado da sua conta, você estava devendo");
            falta = 0;
            chequefoiusado = false;
        }
    }
    public void Sacar(int valor){
        if (valor < saldo){
            saldo = saldo - valor;
            System.out.print("Saque de R$" + valor + ",00 realizado com sucesso");
        }
        else{
            System.out.print("Impossível sacar, valor maior do que saldo disponível");
        }
    }

    public void PagarBoleto(int valor){
        Scanner sc = new Scanner (System.in);
        if (saldo - valor < 0){
            System.out.print("Saldo indísponível, usar cheque especial?\n sim - digite 1\n não - digite 2");
            int opcao = sc.nextInt();
            sc.close();
            if (opcao == 1){
                chequefoiusado = true;
                falta = (saldo - valor) * -1;
                cheque = cheque - falta;
                saldo = 0;
                System.out.print("Pagamento de R$" + valor + ",00 realizado com sucesso, assim que possível o valor de " + (falta + (falta * 0.02)) + "Será debitado da sua conta");
                return;
            }
            else{
                 System.out.print("Pagamento não efetuado, saldo indísponível.");
            }
        }
        else{
            saldo = saldo - valor;
            System.out.print("Pagamento de R$" + valor + ",00 realizado com sucesso");
        }
    }

}
