import java.util.*;
public class calculadoraJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scan.nextDouble();
        
        int opcao = 0;
        do{
             System.out.println("(1)Soma");
             System.out.println("(2)Subtração");
             System.out.println("(3)Multiplicação");
             System.out.println("(4)Divisão");
             System.out.print("Digite o número da operação desejada: ");
             opcao = scan.nextInt();
             if(opcao < 1 || opcao > 4)
             {
                System.out.println("Opção invalida. Digite novamente");
             }
            }while(opcao < 1 || opcao > 4);
        
        double resultado = 0;
        if(opcao == 1)
        {
            resultado = soma(numero1, numero2);
            System.out.println(numero1+" + "+numero2+" = "+resultado);
        }else if(opcao == 2)
        {
            resultado = subtracao(numero1, numero2);
            System.out.println(numero1+" - "+numero2+" = "+resultado);
        }else if(opcao == 3)
        {
            resultado = multiplicacao(numero1, numero2);
            System.out.println(numero1+" * "+numero2+" = "+resultado);
        }else if(opcao == 4)
        {
            resultado = divisao(numero1, numero2);
            System.out.println(numero1+" / "+numero2+" = "+resultado);
        }
    }
    
    public static double soma(double numero1, double numero2)
    {
        double soma = numero1 + numero2;
        return soma;
    }
    
    public static double subtracao(double numero1, double numero2)
    {
        double subtracao = numero1 - numero2;
        return subtracao;
    }
    
    public static double multiplicacao(double numero1, double numero2)
    {
        double multiplicacao = numero1 * numero2;
        return multiplicacao;
    }
    
    public static double divisao(double numero1, double numero2)
    {
        double divisao = numero1 / numero2;
        return divisao;
    }




}
