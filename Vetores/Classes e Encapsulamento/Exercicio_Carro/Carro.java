public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;

    public void Ligar(){
        if (ligado){
            System.out.print("Carro ja ligado");
            return;
        }
        ligado = true;
        System.out.print("Carro ligado, vrum vrum\n");
    }
    public void Desligar(){
        if (marcha == 0 && velocidade == 0 && ligado){
            ligado = false;
            System.out.print("Carro desligado, vrum vrum\n");
        }
        else{
            System.out.print("Carro ja desligado");
        }
    }
    public void Acelerar (int km){
        if (TaNoKm(km)){
            velocidade += km;
             System.out.print("Acelerado, velocidade atual: " + velocidade);
        }
        else{
            System.out.print("Não da pra acelerar, troca a marcha pai");
        }
    }
    public void  Desacelerar (int km){
        if (TaNoKm(km)){
            velocidade -= km;
             System.out.print("Desacelerado, velocidade atual: " + velocidade);
        }
        else{
            System.out.print("Não da pra Desacelerar, troca a marcha pai");
        }
    }
    public void Virar (int lado){
        if (velocidade > 1 && velocidade < 40){
            if (lado == 1){
                System.out.print("Virado pra direita");
            }
            else{
                System.out.print("Virado pra esquerda");
            }
        }
        else{
            System.out.print("Não da pra virar ta muito rápido ou tá desligado");
        }
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void TrocarMarcha(int sobeoudesce){
        if (ligado){
            if (sobeoudesce == 1){
                marcha += 1;
                System.out.println("Marcha subiu, marcha atual: " + marcha);
            }
            else{
                marcha -= 1;
                System.out.println("Marcha desceu, marcha atual: " + marcha);
            }
        } 
    }
    private boolean TaNoKm (int km){
        int kmmax= (marcha * 20);
        int kmmin= (marcha * 20) - 19;
        if (km < kmmax && km > kmmin && ligado){
            return true;
        }
        else{
            return false;
        }
    }
}
 