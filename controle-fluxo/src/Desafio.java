//(valor bruto do salário - percentual de imposto mediante ao salário) + adicional de beneficios

// para calcular o percentual de imposto segue as aliquotas:
// de R$ 0.00 a R$ 1100.00 = 5.00%
// de 1100.01 a R$ 2.500.00 = 10.00%
// maior que R$ 2.500.00 = 15.00%

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = valorSalario * 0.05f;
        }
        else if(valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = valorSalario * 0.10f;
        }
        else if(valorSalario > 2500) {
            valorImposto = valorSalario * 0.15f;
        }
        // calcula e imprime a saída com 2 casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("R$ %.2f", saida);
        leitorDeEntradas.close();
    
}
}
