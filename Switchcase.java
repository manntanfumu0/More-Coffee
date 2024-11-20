public class Switchcase {
    public static void main(String[] args) {
        System.out.println("Exemplo 4 uso do Switch case'");
        System.out.println("1. Cadastro de usuário");
        System.out.println("2. Cadastro de clientes");
        System.out.println("3. Relatórios");
        int opcao = 4;
        switch (opcao) {
            case 1:
            System.out.println("CLIENTES");
                
                break;
        case 2:
        System.out.println("USUÁRIOS");
        break;
        case 3: 
        System.out.println("RELATÓRIOS");
            default:
            System.out.println("Opção inválida");
                break;
        }
        }
    }

