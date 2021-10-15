package com.generation;

public class Main {

    public static void main(String[] args) {
         //Variable tipo string
        byte num2 = 10;
        int num3 = 10;
        long num4 = 10;
        short num5 = 10;

        //Ejemplo de cambio entre tipos de datos
        short cambioTipodeDato = num2;
        int numeroEntero = cambioTipodeDato;
        short numShort = (short) numeroEntero;
        //NOTA: El cambio siempre se hace de variables con tipo de datos mas pequeños hacia variables con tipo de datos mas grandes


        byte numByte1 = 120;
        byte numByte2 = 120;//Tenemos que utilizar una variable short para que pueda almacenar 240 ya que el tipo de dato byte que solo va de -128 a 127
        short suma = (short) (numByte1 + numByte2);

        //Operadores aritmeticos en Java
        //   +   -   *   /   %
        //

        float decimal = 10.5458f;//a los numeros decimales tenemos que agregarle una f
        double decimal2 = 20.151513615d; //tambien deben de llevar f al final

        char unaletra = 'd';
        String nombre = "Alan Mejia Martinez";


        boolean verdadero = true;
        boolean falso= false;



//        System.out.println(numShort);
//        System.out.println(nombre);
//        System.out.println(suma);

        int a=10,b=20,c=30;
        String nombre2 = "Alan Mejia Mtz ";
        System.out.println(a+c);
        System.out.println(a%3);
        System.out.println(c/a);
        System.out.println(a*b*c);
        System.out.println(c-b-a);
        System.out.println(nombre2+nombre2);
        System.out.println(nombre2);
        System.out.println((float) a/3);

    }
}
