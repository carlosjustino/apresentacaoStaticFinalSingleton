package com.justino;

import com.justino.testestatic.Externa;
import com.justino.testestatic.TesteClasseComStatic;
import com.justino.testestatic.TesteClasseExtendendoDaStatic;

public class Principal {
    public static void main(String[] args) {
        TesteClasseComStatic var1 = new TesteClasseComStatic();
        TesteClasseComStatic var2 = new TesteClasseComStatic();
        TesteClasseComStatic var3 = new TesteClasseExtendendoDaStatic();

        System.out.println("var1: " + var1.getVariavelStatic() + " | "
                + "var2: " + var2.getVariavelStatic()
                + " | " +"var3: " + var3.getVariavelStatic() +" | " );



        /*
         * repare que para criar uma instancia da classe estatica não foi necessário
         * criar uma instância da classe Externa
         */
        Externa.Estatica estatica = new Externa.Estatica();
        estatica.imprime();

        /*
         * não é possível criar uma classe não estática sem uma instancia da classe Externa
         */
        //Externa.NaoEstatica naoEstatica = new Externa.NaoEstatica(); //ERRADO!!!
        Externa externa = new Externa();
        Externa.NaoEstatica naoEstatica = externa.new NaoEstatica();
        naoEstatica.imprime();
    }

}
