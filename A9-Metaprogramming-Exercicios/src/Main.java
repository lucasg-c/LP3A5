import manga.Manga;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class mangaClass = Manga.class;

        Constructor[] constructors = mangaClass.getConstructors();
        Constructor constructor = constructors[0];
        Parameter[] parameters = constructor.getParameters();
        Field[] declaredFields = mangaClass.getDeclaredFields();
        Method[] declaredMethods = mangaClass.getDeclaredMethods();

        System.out.println("Class:");
        System.out.println(mangaClass.getName());

        System.out.println("\nConstructor:");
        System.out.println(constructor.getName());

        System.out.println("\nConstructor parameters, fields and their types:");
        for (int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName() + " : " + declaredFields[i].getName());
            System.out.print(" : ");
            System.out.println(declaredFields[i].getType());
        }

        System.out.println("\nConstructor methods and their types and modifiers:");
        for (Method methods : declaredMethods)
        {
            System.out.println(Modifier.toString(methods.getModifiers()) + " " + Arrays.toString(methods.getParameters()));
            System.out.print(" : ");
            System.out.println(methods.getName());
        }
    }
}
