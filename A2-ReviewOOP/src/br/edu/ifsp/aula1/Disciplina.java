package br.edu.ifsp.aula1;

public class Disciplina {
	final public static int QTDAULAS = 20;
	//nao faz sentido ser private
	//"static" : a programacao estruturada em java, usado p questoes relativas a classe
	private int qtdPresenca;
	private double notaProva;
	private double notaTrabalho;
	private double notaExercicios;
	
	public int getQtdPresenca() {
		return qtdPresenca;
	}
	public void setQtdPresenca(int qtdPresenca) {
		this.qtdPresenca = qtdPresenca;
	}
	public double getNotaProva() {
		return notaProva;
	}
	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva;
	}
	public double getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	public double getNotaExercicios() {
		return notaExercicios;
	}
	public void setNotaExercicios(double notaExercicios) {
		this.notaExercicios = notaExercicios;
	}
	
	public double calcularMediaFinal() {
		double mediaFinal = notaProva * 0.4 + notaTrabalho * 0.4 + notaExercicios * 0.2;
		
		return mediaFinal;
	}
	
	public boolean calcularPresenca()
	{
		double porcentagemPresenca = (qtdPresenca * 1.0) / QTDAULAS;
		
		if (porcentagemPresenca >= 0.75)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void passouDeAno()
	{
		//reprova direto: presenca < 75%
		//final: presenca > 75% e media < 6.0
		//aprovado: presenca > 75% e media >= 6.0
		if (calcularPresenca() == false)
		{
			System.out.println("Presen�a insuficiente. Aluno reprovado.");
		}
		else if (calcularMediaFinal() < 4.0)
		{
			System.out.println("Media final insuficiente. Aluno reprovado.");
		}
		else if (calcularPresenca() == true && calcularMediaFinal() < 6.0)
		{
			System.out.println("Presen�a suficiente. Media final insuficiente. Aluno em prova final.");
		}
		else if (calcularPresenca() == true && calcularMediaFinal() >= 6.0)
		{
			System.out.println("Presen�a Suficiente. Media final suficiente. Aluno aprovado");
		}
	}
}
