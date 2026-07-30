import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Maquina maquina = new Maquina();
        int opcao;
        do{
            System.out.print("""
                1 - Dar banho no pet;
                2 - Abastecer com água;
                3 - Abastecer com shampoo;
                4 - verificar nivel de água;
                5 - verificar nivel de shampoo;
                6 - verificar se tem pet no banho;
                7 - colocar pet na maquina;
                8 - retirar pet da máquina;
                9 - limpar maquina.
                0 - sair;\n
            """);
        
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    maquina.darBanho();
                    break;
                case 2:
                    maquina.abastAgua();
                    break;
                case 3:
                    maquina.abastShampoo();
                    break;
                case 4:
                    System.out.print("Nivel água atual: " + maquina.getAgua());
                    break;
                case 5:
                    System.out.print("Nivel shampoo atual: " + maquina.getShampoo());
                    break;
                case 6:
                    if(maquina.temPet()){
                        System.out.print("\nTem pet\n");
                    }
                    else{
                        System.out.print("\nNão tem pet\n");
                    }
                    break;
                case 7:
                    maquina.colocarPet();
                    break;
                case 8:
                    maquina.retirarPet();
                    break;
                case 9:
                    maquina.limparMaquina();
                    break;
                case 0:
                    break;
            }

        }while(opcao != 0);
        sc.close();
        
    }
}