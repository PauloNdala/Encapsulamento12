package exercicio;

public class TestEncapsular {

	public static void main(String[] args) {
		
		/*Instanciando a classe principal **/
		
		 Encapsular obj1 = new Encapsular();
		 Encapsular obj2 = new Encapsular();
		 obj1.Avaliacao().Avaliacao().Avaliacao();
		 obj2.Avaliacao().Avaliacao();
		 
		 System.out.println("O aluno 1 fez "+obj1.numeroDeAvaliacao +" Avalia��es");
		 System.out.println("O aluno 2 fez "+obj2.numeroDeAvaliacao +" Avalia��es");
		 System.out.println("Total das Avalia��es "+Encapsular.totalAvaliacao);
		 System.out.println("Media das Avalia��es "+Encapsular.mediaAvaliacoes(2));

	}

}
