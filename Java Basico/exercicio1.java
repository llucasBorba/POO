import java.util.Scanner;

public class SalarioVendedor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor recebido por carro vendido: R$");
        double valorCarro = input.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int numCarros = input.nextInt();
        
        System.out.print("Digite o valor total de vendas: R$");
        double valorVendas = input.nextDouble();
        
        System.out.print("Digite o salário fixo: R$");
        double salarioFixo = input.nextDouble();
               
    
        double comissao = numCarros * valorCarro;
        double salarioTotal = salarioFixo + comissao + (valorVendas * 0.05);
        
        System.out.printf("Salário final do vendedor: R$%.2f", salarioTotal);
        
        input.close();
    }

}