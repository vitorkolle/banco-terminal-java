import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        Integer numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();
  

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.next();
     

        System.out.println("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeTitular, numeroAgencia, numeroConta, saldo);
    }
}
