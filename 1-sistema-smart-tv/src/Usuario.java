public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atua: " + smartTV.volume);
        
        smartTV.ligar();
        System.out.println("TV ligada: " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("TV ligada: " + smartTV.ligada);
        
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        
        smartTV.mudarCanal(10);
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        
    }
}
