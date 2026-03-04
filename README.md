# Sistema de Gerenciamento de Alunos

Projeto em **Java** que permite cadastrar informações de alunos, listar a turma e calcular médias.  

---

## Funcionalidades

- Cadastrar alunos com:  
  - Nome  
  - Idade  
  - Série  
  - Notas dos três semestres  
- Calcular a média das notas de cada aluno  
- Listar todos os alunos cadastrados  
- Estrutura preparada para futuras funcionalidades como:  
  - Mostrar alunos aprovados/reprovados  
  - Mostrar ranking da turma  

---

## Tecnologias

- Java 17  
- IntelliJ IDEA ou outra IDE de sua preferência  

---

## Estrutura do Projeto

- `Principal.java` → Classe principal, exibe o menu e controla o fluxo do programa  
- `Informacoes.java` → Classe que armazena dados de cada aluno e calcula a média  
- `Turma.java` → Classe que armazena a lista de alunos e permite listar todos  

---
Exemplo de uso
Digite o numero conforme a opção: 
Mostrar Ranking da turma: 4
Mostrar alunos aprovados/reprovados: 3
Cadastrar: 2
Listar: 1
Sair: 0
------------------

Cadastro de aluno:

Nome do aluno: João
Idade do aluno: 15
Serie do aluno(apenas o numero): 1
Nota do Primeiro Semestre: 8.5
Nota do Segundo Semestre: 9.0
Nota do Terceiro Semestre: 7.5

Listagem de alunos:

------------------
Nome: João
Idade: 15
Serie: 1
Nota do primeiro Semestre: 8.5
Nota do Segundo Semestre: 9.0
Nota do Terceiro Semestre: 7.5
Media do aluno: 8.33
------------------


## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/SeuUsuario/SistemadeGerenciamentodeTurma.git
