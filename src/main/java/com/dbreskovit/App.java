package com.dbreskovit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Person> pessoas = new ArrayList<>();
    private static List<Student> alunos = new ArrayList<>();
    private static List<Teacher> professores = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Gerenciar Pessoas");
            System.out.println("2. Gerenciar Alunos");
            System.out.println("3. Gerenciar Professores");
            System.out.println("4. Sair");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1": menuPessoa(scanner); break;
                case "2": menuAluno(scanner); break;
                case "3": menuProfessor(scanner); break;
                case "4": System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida. Tente novamente."); break;
            }
        } while (!opcao.equals("4"));

        scanner.close();
    }

    private static void menuPessoa(Scanner scanner) {
        String opcao;
        do {
            System.out.println("\n-------------------------------------");
            System.out.println("Menu Pessoa:");
            System.out.println("1. Criar Pessoa");
            System.out.println("2. Visualizar Pessoas");
            System.out.println("3. Atualizar Pessoa");
            System.out.println("4. Deletar Pessoa");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.println("-------------------------------------\n");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1": Utils.criarPessoa(scanner, pessoas); break;
                case "2": Utils.visualizarPessoas(pessoas); break;
                case "3": Utils.atualizarPessoa(scanner, pessoas); break;
                case "4": Utils.deletarPessoa(scanner, pessoas); break;
                case "5": System.out.println("Voltando ao Menu Principal..."); break;
                default: System.out.println("Opção inválida. Tente novamente."); break;
            }
        } while (!opcao.equals("5"));
    }

    private static void menuAluno(Scanner scanner) {
        String opcao;
        do {
            System.out.println("\n-------------------------------------");
            System.out.println("Menu Aluno:");
            System.out.println("1. Criar Aluno");
            System.out.println("2. Visualizar Alunos");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Deletar Aluno");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.println("-------------------------------------\n");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1": Utils.criarAluno(scanner, alunos); break;
                case "2": Utils.visualizarAlunos(alunos); break;
                case "3": Utils.atualizarAluno(scanner, alunos); break;
                case "4": Utils.deletarAluno(scanner, alunos); break;
                case "5": System.out.println("Voltando ao Menu Principal..."); break;
                default: System.out.println("Opção inválida. Tente novamente."); break;
            }
        } while (!opcao.equals("5"));
    }

    private static void menuProfessor(Scanner scanner) {
        String opcao;
        do {
            System.out.println("\n-------------------------------------");
            System.out.println("Menu Professor:");
            System.out.println("1. Criar Professor");
            System.out.println("2. Visualizar Professores");
            System.out.println("3. Atualizar Professor");
            System.out.println("4. Deletar Professor");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.println("-------------------------------------\n");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1": Utils.criarProfessor(scanner, professores); break;
                case "2": Utils.visualizarProfessores(professores); break;
                case "3": Utils.atualizarProfessor(scanner, professores); break;
                case "4": Utils.deletarProfessor(scanner, professores); break;
                case "5": System.out.println("Voltando ao Menu Principal..."); break;
                default: System.out.println("Opção inválida. Tente novamente."); break;
            }
        } while (!opcao.equals("5"));
    }
}
