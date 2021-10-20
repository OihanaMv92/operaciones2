package es.studium.operaciones2;

import java.util.Scanner;

public class operaciones2
{
	public static void main(String[] args) //Ejercicio 20
	{
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Indicar un número:");
        num1= teclado.nextInt();
        System.out.println("Indicar otro:");
        num2= teclado.nextInt();
        System.out.println("La suma de los números es: " +suma(num1,num2));
        System.out.println("El número 1 menos el número 2 es: "+resta(num1,num2));
        System.out.println("El producto de los dos números es: " +producto(num1,num2));
        if (num2!=0)
        {
        System.out.println("El cociente de la división del número 1 entre el 2 es: " +cociente(num1,num2));
        }
        else
        {
        System.out.println("La división por 0 no es posible");
        }
        teclado.close();
        }
        
        public static int suma (int a,int b)
        {
        return (a+b);
        }
        public static int resta (int a,int b)
        {
        return (a-b);
        }
        public static int producto (int a,int b)
        {
        return (a*b);
        }
        public static float cociente (int a, int b)
        {
        return ((float)a/(float)b);
        }
}