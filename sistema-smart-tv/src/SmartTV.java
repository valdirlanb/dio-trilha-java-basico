public class SmartTV {
    boolean ligada = false;
    int canal = 9;
    int volume = 25;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Aumentando o volume para: " + this.volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Diminuindo o volume para: " + this.volume);
    }

    public void aumentarCanal() {
        this.canal++;
        System.out.println("Aumentando o canal para: " + this.canal);
    }

    public void diminuirCanal() {
        this.canal--;
        System.out.println("Diminuindo o canal para: " + this.canal);
    }
}