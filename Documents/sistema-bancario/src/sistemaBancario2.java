import java.util.Scanner;

public class sistemaBancario2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;
        String entrada = "", nome="", CPF="",Telefone="", Cadastro="";    
        

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Escolha uma opção: ");
            System.out.println("5. Atualizar Cadastro : ");       
            System.out.println("6. Digitar seu nome: ");
            System.out.println("7. Digitar seu CPF: ");
            System.out.println("8. Digitar seu Telefone: ");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            
           switch (opcao)
           { 
        
           case  1 :
            {
                System.out.print("Digite o valor a ser depositado: ");
                        entrada = scanner.next();
                double deposito = Double.parseDouble(entrada.replace(',', '.'));
                saldo += deposito;
                System.out.printf("Saldo atual: %.1f%n", saldo);
                break;
            }  
            case 2 :
            {
                System.out.print("Digite o valor a ser sacado: ");
                          entrada = scanner.next();
                     double saque = Double.parseDouble(entrada.replace(',', '.'));

                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.printf("Valor Sacado:%.1f%n",saque);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
            }  
            case 3:
             {
                System.out.printf("Saldo atual: %.1f%n", saldo);
                break;
            }  

            case 4:
             {
                System.out.printf("Escolha uma opção");
                break;
            }  

            case 5:
             {
                System.out.printf("Atualizar Cadastro");
                entrada = scanner.next();
                Cadastro= entrada;
                System.out.printf("Complete seu cadastro :%n", nome);
                break;
            }  

          case 6:
             {
                System.out.printf("Digitar seu nome");
                entrada = scanner.next();
                nome = entrada;
                System.out.printf("Seu nome é :%n", nome);
                break;
            } 
            
            case 7:
             {
                System.out.printf("Digitar seu CPF");
                
                entrada = scanner.next();
                CPF= entrada;
                System.out.printf(" CPF :%n", CPF);
                break;
            }
            
            case 8:
             {
                System.out.printf("Digitar seu Telefone");
                entrada = scanner.next();
                Telefone = entrada;
                System.out.printf(" Telefone :%n", Telefone);

                break;
            }  

            case 0 :
             {
                System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
            } 
            default:
            {
                System.out.println("Opção inválida. Tente novamente.");
                break;
           }
        }

        }
    
        scanner.close();
    }

}
