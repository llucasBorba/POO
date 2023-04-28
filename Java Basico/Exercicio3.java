import java.util.Scanner;

public class PesquisaPopulacional {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    
      int mulheresAte35AnosComOlhosEBrilhosCastanhos = 0;
      int totalDeMulheres = 0;
      
    
      while (true) {
         // Variáveis de entrada
         char sexo, corOlhos, corCabelos;
         int idade;
         double salario;
         
        
         System.out.print("Sexo (m/f): ");
         sexo = sc.next().charAt(0);
         if (sexo != 'm' && sexo != 'f') {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            continue;
         }
         
         System.out.print("Cor dos olhos (a/v/c/p): ");
         corOlhos = sc.next().charAt(0);
         if (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            continue;
         }
         
         System.out.print("Cor do cabelo (l/c/p/r): ");
         corCabelos = sc.next().charAt(0);
         if (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            continue;
         }
         
         System.out.print("Idade em anos: ");
         idade = sc.nextInt();
         if (idade == -1) {
            break;
         }
         if (idade < 10 || idade > 100) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            continue;
         }
         
         System.out.print("Salário: ");
         salario = sc.nextDouble();
         if (salario < 0) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            continue;
         }
         
        
         if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
            mulheresAte35AnosComOlhosEBrilhosCastanhos++;
         }
         if (sexo == 'f') {
            totalDeMulheres++;
         }
      }
      
   
      double percentualMulheresAte35AnosComOlhosEBrilhosCastanhos = (double) mulheresAte35AnosComOlhosEBrilhosCastanhos / totalDeMulheres * 100;
      System.out.println("Porcentagem de mulheres com idade entre 18 e 35 anos, olhos castanhos e cabelos castanhos: " + percentualMulheresAte35AnosComOlhosEBrilhosCastanhos + "%");
   }
}
