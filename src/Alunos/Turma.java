package Alunos;
import Alunos.Informacoes;

import java.security.Principal;
import java.util.ArrayList;

public class Turma {

    ArrayList<Informacoes> listadaturma = new ArrayList<>();


    public void adicionarATurma(Informacoes aluno){
        listadaturma.add(aluno);
    }

    public void listarAlunos() {

        if (listadaturma.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado...");
        } else {
            for (Informacoes a : listadaturma) {
                a.mostrarInformacoes();
            }
        }

    }





}
