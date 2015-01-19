package org.maugiam.mavenapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.print("Nombre: ");
		String name = System.console().readLine();
        System.out.println( "Hello " + name +"!" );
    }
}
