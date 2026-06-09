import java.util.Scanner;

public class InterativeCalculate {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer:");
        String operation = scanner.nextLine();

        System.out.println("Digite o primeiro numero");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo numero");
        //String num2 = scanner.nextLine();
        int y = Integer.parseInt(scanner.nextLine());

        if(operation.equals("somar")){
            System.out.println("A soma é: " + (x + y));
        }else if(operation.equals("menos")) {
            System.out.println("A subtracao é: " + (x - y));
        }else if(operation.equals("vezes")) {
            System.out.println("A multiplicacao é: " + (x * y));
        }else if(operation.equals("dividir")) {
            System.out.println("A divisao é: " + (x / y));
        }else{
            System.out.println("Operacao nao aceita");
        }

    }
}
