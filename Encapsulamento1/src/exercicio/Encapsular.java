package exercicio;

public class Encapsular {

	public int numeroDeAvaliacao;
	public static int totalAvaliacao;
	
	//Crando o metodo---
	
	public Encapsular Avaliacao() {
		
		//Incrementando o numero de Avalição---
		
		this.numeroDeAvaliacao++;
		Encapsular.totalAvaliacao++;
		return this;	  
	}
	
	public static double mediaAvaliacoes(int alunos) {
		
		return totalAvaliacao/alunos;
	}
	
}
