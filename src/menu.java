import java.util.Scanner;

public class menu {

    public class menu1 {

        public void main(String[] args) {
            int opcao;

            System.out.println("|     MENU         |   ");
            System.out.println("|     Opções:      |   ");
            System.out.println("|     1. Opção 1   |   ");
            System.out.println("|     2. Opção 2   |   ");
            System.out.println("|     3. Opção 3   |   ");
            System.out.println("|     4. Opção 4   |   ");

            do {

                System.out.println("Selecione uma opção:");
                Scanner menu = new Scanner(System.in);
                opcao = menu.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("Opção 1 selecionada");
                        break;
                    case 2:
                        System.out.println("Opção 2 selecionada");
                        break;
                    case 3:
                        System.out.println("Opção 3 selecionada");
                        break;
                    case 4:
                        System.out.println("sair");
                        break;
                    default:
                        System.out.println("Seleção Inválida");
                }
            }
            while (opcao != 4) ;{
            }


        }
    }
}
