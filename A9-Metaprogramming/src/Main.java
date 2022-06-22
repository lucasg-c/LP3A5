import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThousandTimes();
		//toString().getClass();
	}
	
	public static void ThousandTimes()
	{		
		int i = 0;		
		while(i < 1000)
		{
			System.out.println("Thousand " + (i+1));
			i++;
		}
	}
	
	@Deprecated
	public String toString() {
		System.out.println();
		return "Classe String toString";
	}
	
	@SuppressWarnings("rawtypes")
	public List lista = new ArrayList();

}
