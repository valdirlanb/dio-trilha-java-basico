public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();

        System.out.println("Tv Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual:? " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Tv Ligada? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Tv Ligada? " + smartTV.ligada);
    }
}
