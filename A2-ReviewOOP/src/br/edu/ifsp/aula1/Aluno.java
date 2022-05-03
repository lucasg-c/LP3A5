package br.edu.ifsp.aula1;

public class Aluno {
	
	private String matricula;
	private String nome;
	final private Disciplina disciplina;
		
	public Aluno (String matricula, String nome)
	{		
		this.matricula = matricula;
		this.nome = nome;
		this.disciplina = new Disciplina();
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Disciplina getDisciplina()
	{
		return disciplina;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno("SP003303X", "Alano");
		aluno1.disciplina.setNotaExercicios(9.2);
		aluno1.disciplina.setNotaProva(10.0);
		aluno1.disciplina.setNotaTrabalho(10.0);
		aluno1.disciplina.setQtdPresenca(15);
		
		
		System.out.println(aluno1.getMatricula() + " - " + aluno1.getNome());
		System.out.println(aluno1.matricula + " - " + aluno1.nome);
		System.out.println("Quantidade de aulas: " + Disciplina.QTDAULAS);	
		System.out.println("Media final: " + aluno1.disciplina.calcularMediaFinal());
		System.out.println("Aulas presentes: " + aluno1.disciplina.getQtdPresenca() + "/20");
		System.out.println("Presenca: " + aluno1.disciplina.calcularPresenca());
		aluno1.disciplina.passouDeAno();
		System.out.println(aluno1);		
	}
	
}
