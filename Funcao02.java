import java.util.Scanner;
public class Funcao02
{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha um número: ");
        double a = scanner.nextInt();
        System.out.print("Escolha outro número: ");
        double b = scanner.nextInt();
        
        double resposta = calcular(a, b);

        System.out.println(resposta);
    }
    public static double calcular(double a, double b){
        double x;
        
        x = a*a + 2*a*b + b*b;
        
        return x;
    }
}