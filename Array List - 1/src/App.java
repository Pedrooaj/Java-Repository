import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Id da sala: ");
        String id = scanner.nextLine();
        System.out.println("Digite o nome do professor: ");
        String nomeProf = scanner.nextLine();
        Professor P1 = new Professor(nomeProf);
        Turma T1 = new Turma(id, P1);
        System.out.println("Quantos Alunos deseja adicionar? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0;i < n;i++){
            System.out.println("Digite o nome do Aluno " + i);
            String nome = scanner.nextLine();
            System.out.println("Digite a Matricula do Aluno " + i);
            String matricula = scanner.nextLine();
            Aluno aluno = new Aluno(matricula, nome);
            T1.addAluno(aluno);
        }
        scanner.close();
        T1.exibirAlunos();

    }
}
