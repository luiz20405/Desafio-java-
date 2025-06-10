import java.util.Scanner;

public class desafioLuiz {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String resposta;
        do{
            resposta = "S";
            System.out.println("AGENDAMENTO LAVA-JATO");
            System.out.println("Digite seu nome");
            String nome = input.nextLine();

            System.out.println("Digite o modelo do seu carro:");
            String carro = input.nextLine();

            System.out.print("Digite um dia para a lavagem do seu carro:");
            String data = input.nextLine();

            System.out.println("=============MENU============");
            System.out.println("[1] LAVAGEM A SECO ");
            System.out.println("[2] LAVAGEM INTEIROR ");
            System.out.println("[3] LAVAGEM EXTERIOR ");
            System.out.println("[4] LAVAGEM COMPLETA ");
            System.out.println("SELECIONE A OPCAO DO MENU ACIMA: ");
            int escolha = input.nextInt();
            input.nextLine();
            switch (escolha) {
                case 1:
                    System.out.printf("A lavagem a seco para o %s foi agendada com sucesso para %s, SR. %s \n, agradecemos a sua preferência \n", carro, data, nome);
                    break;
                case 2:
                    System.out.printf("A lavagem de interior para o %s foi agendada com sucesso para o dia %s, SR. %s \n, agradecemos a sua preferência \n", carro, data, nome);
                    break;
                case 3:
                    System.out.printf("A lavagem do exterior foi para o %s agendada com sucesso para  %s, SR. %s, agradecemos a sua preferência \n", carro, data, nome);
                    break;
                case 4:
                    System.out.printf("A lavagem completa para o %s foi agendada com sucesso para %s, SR. %s \n, agradecemos a sua preferência \n", carro, data, nome);
                    break;
                default:
                    System.out.println("Essa opção não existe \n");
                    break;
            }
            System.out.printf("Deseja agendar mais algum tipo de lavagem, sr %s [s/n]", nome);
            resposta = input.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
    System.out.println("Agendamento concluido, seu carro está em boas mãos!");
    input.close();
    }
}