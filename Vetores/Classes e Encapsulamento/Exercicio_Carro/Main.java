import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Carro ford = new Carro();
        int opcao;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("""
            \nSISTEMA DO CARRO
            1 - Ligar o carro
            2 - Desligar o carro
            3 - Acelerar
            4 - Diminuir velocidade
            5 - Virar para esquerda
            6 - Virar para direita
            7 - Verificar velocidade
            8 - Aumentar marcha
            9 - Baixar marcha
            0 - Sair
            \n""");
        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                ford.Ligar();
                break;
            case 2:
                ford.Desligar();
                break;
            case 3:
                System.out.print("Quanto de velocidade você quer acelerar?");
                int km = sc.nextInt();
                ford.Acelerar(km);
                break;
            case 4:
                System.out.print("Quanto de velocidade você quer desacelerar?");
                km = sc.nextInt();
                ford.Desacelerar(km);
                break;
            case 5:
                ford.Virar(0);
                break;
            case 6:
                ford.Virar(1);
                break;
            case 7:
                System.out.print("Velocidade atual: " + ford.getVelocidade());
                break;
            case 8:
                ford.TrocarMarcha(1);
                break;
            case 9:
                ford.TrocarMarcha(0);
                break;
            case 0:
                break;
        }
        }while(opcao != 0 );
        sc.close();
    }
}