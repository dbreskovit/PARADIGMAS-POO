package com.dbreskovit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void criarPessoa(Scanner scanner, List<Person> pessoas) {
        System.out.println("CRIANDO E PREENCHENDO OBJETO << PESSOA >>");
        System.out.print("Digite o CPF: ");
        String cpfPessoa = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();
        System.out.print("Digite o sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Digite o estado civil: ");
        String estadoCivil = scanner.nextLine();
        try {
            Date birthDate = dateFormat.parse(dataNascimento);
            Person pessoa = new Person(cpfPessoa, nomePessoa, birthDate, endereco, cidade, estado, sexo, estadoCivil);
            pessoas.add(pessoa);
            System.out.printf("Pessoa %s criada! -> CONSTRUTOR%n", pessoa.getName());
        } catch (ParseException e) {
            System.out.println("Data de nascimento inválida. Use o formato dd/MM/yyyy.");
        }
    }

    public static void visualizarPessoas(List<Person> pessoas) {
        System.out.println("VISUALIZANDO PESSOAS");
        for (Person pessoa : pessoas) {
            String birthDate = dateFormat.format(pessoa.getBirthDate());
            System.out.printf(
                "Nome: %s - CPF: %s - Data de Nascimento: %s - Endereço: %s - Cidade: %s - Estado: %s - Sexo: %s - Estado Civil: %s%n",
                pessoa.getName(), pessoa.getCpf(), birthDate, pessoa.getAddress(), pessoa.getCity(),
                pessoa.getState(), pessoa.getGender(), pessoa.getMaritalStatus());
            System.out.println("\n___________________________\n");
        }
    }

    public static void atualizarPessoa(Scanner scanner, List<Person> pessoas) {
        System.out.println("ATUALIZANDO PESSOA");
        System.out.print("Digite o CPF da pessoa a ser atualizada: ");
        String cpf = scanner.nextLine();
        Person pessoa = encontrarPessoaPorCpf(cpf, pessoas);
        if (pessoa != null) {
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine();
            pessoa.setName(novoNome);
            System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
            String novaDataNascimento = scanner.nextLine();
            try {
                Date birthDate = dateFormat.parse(novaDataNascimento);
                pessoa.setBirthDate(birthDate);
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                pessoa.setAddress(novoEndereco);
                System.out.print("Digite a nova cidade: ");
                String novaCidade = scanner.nextLine();
                pessoa.setCity(novaCidade);
                System.out.print("Digite o novo estado: ");
                String novoEstado = scanner.nextLine();
                pessoa.setState(novoEstado);
                System.out.print("Digite o novo sexo: ");
                String novoSexo = scanner.nextLine();
                pessoa.setGender(novoSexo);
                System.out.print("Digite o novo estado civil: ");
                String novoEstadoCivil = scanner.nextLine();
                pessoa.setMaritalStatus(novoEstadoCivil);
                System.out.printf("Pessoa atualizada! Novo nome: %s%n", pessoa.getName());
            } catch (ParseException e) {
                System.out.println("Data de nascimento inválida. Use o formato dd/MM/yyyy.");
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void deletarPessoa(Scanner scanner, List<Person> pessoas) {
        System.out.println("DELETANDO PESSOA");
        System.out.print("Digite o CPF da pessoa a ser deletada: ");
        String cpf = scanner.nextLine();
        Person pessoa = encontrarPessoaPorCpf(cpf, pessoas);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            System.out.println("Pessoa deletada.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void criarAluno(Scanner scanner, List<Student> alunos) {
        System.out.println("CRIANDO E PREENCHENDO OBJETO << ALUNO >>");
        System.out.print("Digite o CPF: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o código do curso: ");
        String codigoCurso = scanner.nextLine();
        Student aluno = new Student(cpfAluno, nomeAluno, matricula, codigoCurso);
        alunos.add(aluno);
        System.out.printf("Aluno %s criado! -> CONSTRUTOR%n", aluno.getName());
    }

    public static void visualizarAlunos(List<Student> alunos) {
        System.out.println("VISUALIZANDO ALUNOS");
        for (Student aluno : alunos) {
            System.out.printf("Nome: %s - CPF: %s - Matrícula: %s - Código do Curso: %s%n", aluno.getName(), aluno.getCpf(), aluno.getEnrollment(), aluno.getCourseCode());
            System.out.println("\n___________________________\n");
        }
    }

    public static void atualizarAluno(Scanner scanner, List<Student> alunos) {
        System.out.println("ATUALIZANDO ALUNO");
        System.out.print("Digite o CPF do aluno a ser atualizado: ");
        String cpf = scanner.nextLine();
        Student aluno = (Student) encontrarPessoaPorCpf(cpf, alunos);
        if (aluno != null) {
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine();
            aluno.setName(novoNome);
            System.out.printf("Aluno atualizado! Novo nome: %s%n", aluno.getName());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void deletarAluno(Scanner scanner, List<Student> alunos) {
        System.out.println("DELETANDO ALUNO");
        System.out.print("Digite o CPF do aluno a ser deletado: ");
        String cpf = scanner.nextLine();
        Student aluno = (Student) encontrarPessoaPorCpf(cpf, alunos);
        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno deletado.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void criarProfessor(Scanner scanner, List<Teacher> professores) {
        System.out.println("CRIANDO E PREENCHENDO OBJETO << PROFESSOR >>");
        System.out.print("Digite o CPF: ");
        String cpfProfessor = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Digite o SIAPE: ");
        String siape = scanner.nextLine();
        System.out.print("Digite a categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Digite a titulação: ");
        String titulacao = scanner.nextLine();
        System.out.print("Digite a carga horária: ");
        int cargaHoraria = Integer.parseInt(scanner.nextLine());
        Teacher professor = new Teacher(cpfProfessor, nomeProfessor, siape, categoria, titulacao, cargaHoraria);
        professores.add(professor);
        System.out.printf("Teacher %s criado! -> CONSTRUTOR%n", professor.getName());
    }

    public static void visualizarProfessores(List<Teacher> professores) {
        System.out.println("VISUALIZANDO PROFESSORES");
        for (Teacher professor : professores) {
            System.out.printf("Nome: %s - CPF: %s - SIAPE: %s - Categoria: %s - Titulação: %s - Carga Horária: %d%n", professor.getName(), professor.getCpf(), professor.getSiape(), professor.getCategory(), professor.getDegree(), professor.getWorkload());
            System.out.println("\n___________________________\n");
        }
    }

    public static void atualizarProfessor(Scanner scanner, List<Teacher> professores) {
        System.out.println("ATUALIZANDO PROFESSOR");
        System.out.print("Digite o CPF do professor a ser atualizado: ");
        String cpf = scanner.nextLine();
        Teacher professor = (Teacher) encontrarPessoaPorCpf(cpf, professores);
        if (professor != null) {
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine();
            professor.setName(novoNome);
            System.out.printf("Teacher atualizado! Novo nome: %s%n", professor.getName());
        } else {
            System.out.println("Teacher não encontrado.");
        }
    }

    public static void deletarProfessor(Scanner scanner, List<Teacher> professores) {
        System.out.println("DELETANDO PROFESSOR");
        System.out.print("Digite o CPF do professor a ser deletado: ");
        String cpf = scanner.nextLine();
        Teacher professor = (Teacher) encontrarPessoaPorCpf(cpf, professores);
        if (professor != null) {
            professores.remove(professor);
            System.out.println("Teacher deletado.");
        } else {
            System.out.println("Teacher não encontrado.");
        }
    }

    private static Person encontrarPessoaPorCpf(String cpf, List<? extends Person> pessoas) {
        for (Person pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }
}
