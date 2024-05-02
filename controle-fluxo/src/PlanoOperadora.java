public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "D";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube video");
                break;
            }
            case "G": {
                System.out.println("10GB Youtube video");
                System.out.println("Whatsapp e Instagram ilimitados");
                break;
            }
            case "D": {
                System.out.println("10GB Youtube video");
                System.out.println("Whatsapp e Instagram ilimitados");
                System.out.println("Netflix ilimitado");
                break;
            }
            default: {
                System.out.println("Plano inválido");
                break;
            }
    }
    
 }
}
