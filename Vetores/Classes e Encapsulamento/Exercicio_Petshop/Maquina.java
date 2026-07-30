public class Maquina{
    private boolean tem_pet;
    private int agua;
    private int shampoo;
    private boolean petlimpo = false;
    private boolean maquinalimpa = true;

    public void darBanho (){
        if (!tem_pet){
            System.out.print("Sem pet pra dar banho\n");
            return;
        }
        if (agua < 10 || shampoo < 2){
            System.out.print("Recursos insuficientes, verifique níveis de água/shampoo\n");
            return;
        }
        agua = agua - 10;
        shampoo = shampoo - 2;
        petlimpo = true;
        System.out.print ("Banho dado, pet limpinho\n");
    }

    public void abastAgua(){
        if (agua >= 30){
            System.out.print("Já está cheio");
            return;
        }
        agua = agua + 2;
        System.out.print("Água abastecida em 2 litros. \nNível da água: " + agua);
    }
    public void abastShampoo(){
        if (shampoo >= 10){
            System.out.print("Já está cheio\n");
            return;
        }
        shampoo = shampoo + 2;
        System.out.print("Shampoo abastecido em 2 litros. \nNível de shampoo: " + shampoo);
    }
    public int getAgua (){
        return agua;
    }
    public int getShampoo (){
        return shampoo;
    }
    public boolean temPet(){
        if (tem_pet){
            return true;
        }
        else{
            return false;
        }
    }
    public void colocarPet(){
        if (tem_pet){
            System.out.print("Já tem pet na máquina, não é possível adicionar \n"); 
            return;
        }
        if (!maquinalimpa){
            System.out.print("Máquina suja, limpe antes de adicionar \n"); 
            return;
        }
        tem_pet = true;
        petlimpo = false;
        System.out.print("Pet adicionado na máquina\n");
    }
    public void retirarPet(){
        if (!tem_pet){
            System.out.print("Não tem pet na máquina, não é possível retirar \n"); 
            return;
        }
        if (!petlimpo){
            System.out.print("Pet não foi limpo, máquina está suja, limpe-a antes de usa-lá novamente\n");
            maquinalimpa = false;
        }
        tem_pet = false;
        System.out.print("Pet retirado da máquina\n");
    }
    public void limparMaquina(){
        if (maquinalimpa){
            System.out.print("Máquina já está limpa\n");
            return;
        }
        if (agua < 3 || shampoo < 1){
            System.out.print("Recursos insuficientes, verifique nível de agua/shampoo\n");
            return;
        }
        agua = agua - 3;
        shampoo = shampoo - 1;
        maquinalimpa = true;
        System.out.print("Limpeza feita com sucesso\n");
    }
}