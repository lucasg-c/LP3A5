import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static class Aluno
    {
        private Integer matricula;
        private String nome;
        private Double nota;

        public Aluno(Integer matricula, String nome, Double nota) {
            this.setMatricula(matricula);
            this.setNome(nome);
            this.setNota(nota);
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "matricula=" + matricula +
                    ", nome='" + nome + '\'' +
                    ", nota=" + nota +
                    '}';
        }

        public Integer getMatricula() {
            return matricula;
        }

        public void setMatricula(Integer matricula) {
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getNota() {
            return nota;
        }

        public void setNota(Double nota) {
            this.nota = nota;
        }
    }

    public static void main(String[] args)
    {
        //...
        System.out.println("Hello, world!\n");

        Aluno a1 = new Aluno(0, "Crystal", 8.7);
        Aluno a2 = new Aluno(1, "Gorgon", 4.8);
        Aluno a3 = new Aluno(2, "Kamala", 10.0);
        Aluno a4 = new Aluno(3, "Medusa", 8.0);
        Aluno a5 = new Aluno(4, "Karnak", 6.1);
        Aluno a6 = new Aluno(5, "Black Bolt", 3.5);
        Aluno a7 = new Aluno(6, "Lockjaw", 5.5);
        Aluno a8 = new Aluno(7, "Maximus", 5.3);
        Aluno a9 = new Aluno(0, "Auran", 4.3);
        Aluno a10 = new Aluno(0, "Triton", 2.0);

        List<Aluno> alunos = new ArrayList<Aluno>();
        Collections.addAll(alunos, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        System.out.println("Alunos:\n");
        System.out.println(alunos);

        List<Aluno> alunosNotaCrescente = alunos.stream().sorted(new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return (int) (o1.getNota() - o2.getNota());
            }
        }).collect(Collectors.toList());

        System.out.println("\nAlunos ordenados por nota crescente:");
        System.out.println(alunosNotaCrescente);

        System.out.println("\nMenor nota:");
        Comparator<Aluno> comparatorNota = Comparator.comparing(Aluno::getNota);
        System.out.println(alunos.stream().min(comparatorNota));


    }
}
