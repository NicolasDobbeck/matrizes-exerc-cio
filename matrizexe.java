import java.util.Scanner;
import java.text.DecimalFormat;
public class matrizexe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double m[][] = new double[2][2];

        for (int linha = 0; linha < m.length; linha++){
            for (int coluna = 0; coluna < m.length; coluna ++) {
                System.out.println("Digite um valor: ");
                m[linha][coluna] = input.nextDouble();
            }
        }
        System.out.println("A média é: " + df.format(media(m)));
        System.out.println("O menor número é: " + df.format(menor(m)));
        System.out.println("O maior número é: " + df.format(maior(m)));
    }
    
    public static double maior(double m[][]){
       double maiordetodos = m[0][0];
       for (int linha = 0; linha< m.length; linha++){
           for (int coluna = 0; coluna<m.length; coluna ++){
               if(maiordetodos < m[linha][coluna]){
                    maiordetodos = m[linha][coluna];
                }
           
            }
       
        }
        return maiordetodos;
    }
    public static double menor(double m[][]){
        double menordetodos = m[0][0];
        for (int linha = 0; linha < m.length; linha ++){
            for(int coluna = 0; coluna < m[0].length; coluna ++){
                if (menordetodos > m[linha][coluna]){
                    menordetodos = m[linha][coluna];
                }
            }
        }
        return menordetodos;
    }
    public static double media (double m[][]){
        double total = 0;

        for (int linha = 0; linha < m.length; linha++){
            for (int coluna = 0; coluna < m.length; coluna ++){
                total += m[linha][coluna];
            }
        }
        double media = total / (m.length * m[0].length);
        return media;
    } 
}