import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final List<String> lista = Arrays.asList("amor", "bola", "casa", "dado");
		System.out.println("Cria��o de lista com os elementos 'amor', 'bola', 'casa' e 'dado'");
		
		//print 1
		System.out.println("a) Print usando 'for':");
		for (String aux : lista) { System.out.println(aux);	} //amor, bola, casa, dado. print na ordem da lista
		System.out.println();
		
		//print 2
		System.out.println("b) Print usando 'parallelStream()'");
		lista.parallelStream().forEach(System.out::println); //casa, dado, bola, amor. a ordem � alterada
		System.out.println();
		
		//print 3
		System.out.println("c) Print usando 'stream()':");
		lista.stream().forEach(System.out::println); //printa na ordem que a lista foi estruturada
		System.out.println("\n\n");
		
		String[] nomes = new String[] {"Alomomola", "Beartic", "Chatot", "Dratini", "E."};
		System.out.print("Array com nomes e Stream a partir dela:\n");
		Arrays.stream(nomes).forEach(System.out::println); //printa na ordem
		System.out.println();
		
		System.out.println("Cria��o de Stream com os elementos 'Carro', 'Navio', new Main(), 'Bicicleta'");
		Stream.of("Carro", "Navio", new Main(), "Bicicleta").forEach(System.out::println); //new Main() retorna o endere�o de mem�ria
		System.out.println();
		
		System.out.println("Cria��o de Stream de um intervalo de n�meros com IntStream");
		IntStream.rangeClosed(10,15).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Cria��o de Stream via iterate");
		Stream.iterate(true, valor -> valor).limit(4).forEach(System.out::println);
		//Stream.iterate(true, valor -> !valor).limit(5).forEach(System.out::println);
		System.out.println();
		
		/*
		 * opera��es intermedi�rias de filtro:
		 * skip(n) salta N linhas
		 * limit(n) limita a quantidade de dados
		 * distinct (elimina repeti��es)
		 * filter() permite o uso de uma fun��o lambda p implementar filtros personalizados
		 * */
		
		System.out.println("Usando fun��es intermedi�rias skip 1 e limit 2 no array de nomes:");
		Arrays.stream(nomes).skip(1).limit(2).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Usando fun��o intermedi�ria filter com 't' no array de nomes:");
		Arrays.stream(nomes).filter(nome -> nome.contains("t")).forEach(System.out::println);
		System.out.println();
		
		/*
		 * Outras fun��es intermedi�rias
		 * .map() � uma opera��o de transforma��o, executando p todos os itens de um stream. muito usado p estruturar dados.
		 * .peek() utilizado p debug, ajudando a imprimir oq est� ocorrendo entre as opera��es intermedi�rias
		 * 
		 * pro-tip: filtrar primeiro e transformar depois*/
		
		System.out.println("smt smt Transforma��o do array nomes com .map, contando caracteres:");
		Arrays.stream(nomes).map( nome -> nome + " " + nome.length() ).forEach(System.out::println);
		System.out.println();
		
		System.out.println("smt smt Transforma��o do array nomes com .map, colocando-os em UpperCase:");
		Arrays.stream(nomes).map( nome -> nome + " " + nome.toUpperCase() ).forEach(System.out::println);
		System.out.println();
		
		System.out.println("smt smt Array nomes: filtro 't', transforma��o em UpperCase:");
		Arrays.stream(nomes).filter(nome -> nome.contains("t")).map(nome -> nome + " " + nome.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		/*
		 * Collectors:
		 * .toList() transforma Stream em List
		 * .toMap() transforma Stream em Map
		 * .toSet() transforma Stream em Set
		 * .joining() concatena os valores String em uma String s�*/
		
		final OptionalInt resultadoSoma = IntStream.rangeClosed(1, 10).reduce((v1, v2) -> v1 + v2);
		System.out.println(resultadoSoma.getAsInt());
		System.out.println();
		
		//final String resultadoConcatenacao = Stream.of(nomes);
		
		final List<String> listaVazia = new ArrayList<>();
		//final String resultadoConcatenacao =
		
		/*
		 * Interfaces Funcionais
		 * Supplier		n�o recebe par�metro de entrada e produz valor de sa�da;
		 * Consumer		recebe um par�metro de entrada e n�o produz valor de sa�da;
		 * BiConsumer	semelhante ao consumer, mas recebe dois par�metros;
		 * Predicate	recebe um par�metro, realiza um teste e retorna um boolean;
		 * Function		recebe um valor e retorna outro valor;
		 * UnaryOperator	caso espec�fico de function em que h� obriga��o de par�metro de entrada e valor de sa�da serem do mesmo tipo*/
		
		Stream.generate(() -> new Random().nextInt()).limit(5).forEach((v) -> System.out.println(v));
		
	}

}
