import java.util.Optional;

public class ExemploOptional {
	static Optional<String> optString;
	
	public static void main(String[] args)
	{
		String s = "teste";
		optString = Optional.of(s);
		
		System.out.println("optString.get(): " + optString.get());
		
		System.out.println(optString.orElse("Valor n�o encontrado"));
		
		//Lambda pode ser usado em situa��es de c�digo extenso e demorado, como acesso ao banco
		System.out.println(optString.orElseGet( () -> longoValor()));
		
		System.out.println(optString.orElseThrow( () -> new RuntimeException("")));
		
		//por�m, n�o recomendado
		if(optString.isPresent())
		{
			System.out.println("optString.isPresent(): " + optString.get());
		}
		
		optString.filter( a -> a.contains("g")).ifPresent(System.out::println);
	}
	
	public static String longoValor()
	{
		//TODO chamada ao DB
		return "valor encontrado no Banco";
	}
}
