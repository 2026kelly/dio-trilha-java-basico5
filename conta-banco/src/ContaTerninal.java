import javax.swing.JOptionPane;

public class ContaTerninal {
    public static void main(String[] args) throws Exception {
        

        estaeumafuncao( );
    }


    public static void estaeumafuncao()
    {

        // atributos (variaveis)
        String a =JOptionPane.showInputDialog("Digite nome do Cliente");
        String b =JOptionPane.showInputDialog("Por favor digite o número da agência");
        String c =JOptionPane.showInputDialog("Digite o número  da conta");
        String d =JOptionPane.showInputDialog("saldo");

         //exemplo
         /* 
        String a =JOptionPane.showInputDialog("Digite nome do Cliente");
        int String b =JOptionPane.showInputDialog("Por favor digite o número da agência");
        int String c =JOptionPane.showInputDialog("Digite o número  da conta");
        int String d =JOptionPane.showInputDialog("saldo");
        */

        // escopo
        System.out.println("Digite nome do Cliente");
        
        System.out.println(a);


        System.out.println("Por favor digite o número da agência");
        


        System.out.println("Digite o número  da conta" );
       
        System.out.println(c);

        System.out.println("saldo");
       
        System.out.println(d);

        System.out.println("Olá [ " + a +  " ], obrigado por criar uma conta em nosso banco, sua agência é [ " + b + "], conta [ " + c + " ] e seu saldo [ "+ d + " ] já está disponível para saque\".");


    }

}
