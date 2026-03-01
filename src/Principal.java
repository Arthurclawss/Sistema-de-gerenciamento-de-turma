import Alunos.Informacoes;
import Alunos.Turma;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Turma turma = new Turma();


        Scanner sc = new Scanner(System.in);


        int opcao;
        do {

            System.out.println("Digite o numero conforme a opção: ");
            System.out.println("Mostrar Ranking da turma: 4");
            System.out.println("Mostrar alunos aprovados/reprovados: 3");
            System.out.println("Cadastrar: 2 ");
            System.out.println("Listar: 1 ");
            System.out.println("Sair: 0");
            System.out.println("------------------");
            opcao = sc.nextInt();
            sc.nextLine();


                Informacoes aluno = new Informacoes();

            if (opcao == 2) {
                aluno.resgatarInformacoes();
                turma.adicionarATurma(aluno);
            }

            if (opcao == 3){

            }

            if(opcao == 1){
                turma.listarAlunos();

            }
        }
            while (opcao != 0);
            System.out.println("Obrigado, volte sempre");
            sc.close();

    }
}
