public class SistemaMedida {

    public static void main(String[] args) {
        
        String sigla = "T";

        switch (sigla) {
            case "P": {
                System.out.println("Peso");
                break;
            }
            case "T": {
                System.out.println("Temperatura");
                break;
            }
            case "A": {
                System.out.println("Altura");
                break;
            }
            default: {
                System.out.println("Sigla inválida");
                break;
            }
    }
    

 }
}
