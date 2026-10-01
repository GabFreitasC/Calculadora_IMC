package calculoimc;
import java.util.Scanner;
/*
@author Biel
*/
public class CalculoIMC {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("SEJA BEM-VINDO(A)\n");
        
        System.out.print("Digite seu nome: ");
        String name = input.next();
        
        System.out.printf("\nMuito prazer, %s!\nVamos calcular seu IMC?\n", name);
        System.out.print("Digite 'S' ou 'N': ");
        String option = input.next().toLowerCase();
        
        if(!option.equals("s")){
            System.out.println("Sem problemas, volte quando quiser :)");
            return;
        }
        
        System.out.print("\nInforme sua altura em metros (exemplo: 1,75): ");
            double altura = input.nextDouble();
            
            System.out.print("Agora informe o seu peso em kg (exemplo: 51,5): ");
            double peso = input.nextDouble();
            
            double imc = peso/(altura*altura);
            
            System.out.print("\nCalculando...\n");
            
            System.out.printf("\n%s, seu IMC é: %.2f%n",name, imc);
    }
    
}