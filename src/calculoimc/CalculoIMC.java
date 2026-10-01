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
        
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        
        System.out.printf("\nMuito prazer, %s.\nAgora que eu sei que você tem %d anos, vamos calcular seu IMC?\n", name, age);
        System.out.print("Digite 'S' ou 'N': ");
        String option = input.next().toLowerCase();
        
        if(option.equals("s")){
            System.out.print("Informe sua altura (exemplo: 1,75): ");
            double altura = input.nextDouble();
            
            System.out.printf("\nLegal %s, agora informe o seu peso (exemplo: 51,5): ",name);
            double peso = input.nextDouble();
        }else{
            System.out.println("Sem problemas, volte quando quiser :)");
        }
    }
    
}