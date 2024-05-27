import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {   
    public static void main(String[] args){
    //TO DO:conhecer e importar a Classe Scanner=ok
    //exibir msg para os usuário      

        String nomeScanner;
        String sobrenomeScanner;
        String contaScanner;
        String agenciaScanner;
        String saldoScanner;

try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

    System.out.println("Por favor, digite o seu primeiro nome!");
    nomeScanner = scanner.next();
    
    System.out.println("Por favor, digite o seu sobrenome!");
    sobrenomeScanner = scanner.next();
   
    System.out.println("Por favor, digite o número da agência!");
    agenciaScanner = scanner.next();

    System.out.println("Por favor, digite o número da conta com o dígito!");
    contaScanner = scanner.next();

    System.out.println("Por favor, qual será o aporte inicial?");
    saldoScanner = scanner.next();
    //Obter pelo Scanner os valores digitados no tertminal

   
    //Exibir a msg conta criada
System.out.println("Olá "+ nomeScanner + " "+ sobrenomeScanner+ ", obrigado por criar uma conta em nosso banco!");
 System.out.println("Sua agência é " + agenciaScanner +", conta "+ contaScanner +".");
 System.out.println("Seu saldo R$ "+ saldoScanner +", já está disponível para saque!"); 
System.out.println(" ");

};  
};
}
