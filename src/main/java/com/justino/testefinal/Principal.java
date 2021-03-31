package com.justino.testefinal;

public class Principal {
    public static void main(String[] args) {
        TesteClasseComStatic var1 = new TesteClasseComStatic();
        TesteClasseComStatic var2 = new TesteClasseComStatic();
        TesteClasseComStatic var3 = new TesteClasseExtendendoDaStatic();

        System.out.println("var1: " + var1.getVariavelStatic() + " | "
                + "var2: " + var2.getVariavelStatic()
                + " | " +"var3: " + var3.getVariavelStatic() +" | " );


    }
}
