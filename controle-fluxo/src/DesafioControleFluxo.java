import java.util.Scanner;

public class DesafioControleFluxo {
    public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
               // chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (IllegalArgumentException e) {

                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            } catch (DesafioControleFluxo.Contador.ParametrosInvalidosException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            terminal.close();
            }
            static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
                //validar se parametroUm é MAIOR que parametroDois e lançar uma exceção
                if (parametroUm > parametroDois) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                } else {
                    for (int i = parametroUm; i <= parametroDois; i++) {
                        System.out.println(i);
                    }
                }
            }
            // criar a classe ParametrosInvalidosException que representará a exceção de negócio no sistema
            static class ParametrosInvalidosException extends Exception {
                public ParametrosInvalidosException(String mensagem) {
                    super(mensagem);
                }
            }
            }
        }