import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("FileNotFoundException:");
            readFile();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

        try
        {
            System.out.println("IndexOutOfBoundsException:");
            getSeason(4);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        try
        {
            System.out.println("ArithmeticException:");
            withdrawAmount(500.50);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void readFile() throws FileNotFoundException
    {
        String fileName = "non_existing_file.txt";
        File file = new File(fileName);
        FileInputStream stream = new FileInputStream(file);
    }

    public static void getSeason(int i) throws IndexOutOfBoundsException
    {
        ArrayList<String> seasons = new ArrayList<String>();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Fall");
        seasons.add("Winter");

        System.out.println(seasons.get(i));
    }

    public static void withdrawAmount(double amount) throws ArithmeticException
    {
        Double balance = 200.00;

        if (amount > balance)
        { throw new ArithmeticException("Not enough credits."); }
    }

}
