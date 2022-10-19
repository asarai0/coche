package com.example.demo1;

public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(4,4,6);
        System.out.println(resultado);
    }
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}

package com.example.demo1;

public class Main {
    public static void main(String[] args) {
        coche Micoche= new coche();
        Micoche.SumarlePuerta();
        System.out.println(Micoche.puertas);
    }
}
class coche{
    public int puertas=0;
    public void SumarlePuerta(){
        this.puertas++;
    }}

