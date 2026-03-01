package Alunos;

import java.util.Scanner;

public class Informacoes {
    String nome;
    int idade;
    int serie;
    double notaSemestre1;
    double notaSemestre2;
    double notaSemestre3;
    double media = 0 ;



    public double getNotaSemestre1() {
        return notaSemestre1;
    }

    public double getNotaSemestre2() {
        return notaSemestre2;
    }

    public double getNotaSemestre3() {
        return notaSemestre3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    Scanner sc = new Scanner(System.in);
    public void resgatarInformacoes(){
        System.out.println("Nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("Idade do aluno: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Serie do aluno(apenas o numero): ");
        serie = sc.nextInt();
        sc.nextLine();


        System.out.println("Nota do Primeiro Semestre: ");
        notaSemestre1 = sc.nextDouble();
        sc.nextLine();


        System.out.println("Nota do Segundo Semestre: ");
        notaSemestre2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Nota do Terceiro Semestre: ");
        notaSemestre3 = sc.nextDouble();
        sc.nextLine();

        media = (notaSemestre1+notaSemestre2+notaSemestre3)/3;

    }


    public void mostrarInformacoes(){
        System.out.println("------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Serie: "+serie);
        System.out.println("Nota do primeiro Semestre: "+notaSemestre1);
        System.out.println("Nota do Segundo Semestre: "+notaSemestre2);
        System.out.println("Nota do Terceiro Semestre: "+notaSemestre3);
        System.out.println("Media do aluno: "+media);
        System.out.println("------------------");
    }

}
