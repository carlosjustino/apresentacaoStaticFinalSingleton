package com.justino;

import com.justino.testesingleton.ClasseJustinoSingletonThreadSafe;
import com.justino.testesingleton.ClasseJustinoSingletonThreadSafe2;
import com.justino.testesingleton.ClasseJustinoSingletonThreadSafe3;
import com.justino.testesingleton.ClasseJustinoSingletonThreadSafe4;
import com.justino.testestatic.Externa;
import com.justino.testestatic.TesteClasseComStatic;
import com.justino.testestatic.TesteClasseExtendendoDaStatic;

public class Principal {
    public static void main(String[] args) {
        TesteClasseComStatic var3 = new TesteClasseExtendendoDaStatic();
        TesteClasseComStatic var1 = new TesteClasseComStatic();
        TesteClasseComStatic var2 = new TesteClasseComStatic();

        System.out.println("var1: " + var1.getVariavelStatic() + " | "
                + "var2: " + var2.getVariavelStatic()
                + " | " +"var3: " + var3.getVariavelStatic() +" | " );


        /*
            ==================================================================================
         */
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

        /*
            ==================================================================================
        */

        ClasseJustinoSingletonThreadSafe oia = ClasseJustinoSingletonThreadSafe.getInstance();
        System.out.println(oia.getOia());
        ClasseJustinoSingletonThreadSafe.getInstance().setOia("Teste 1");
        System.out.println(oia.getOia());
        System.out.println(ClasseJustinoSingletonThreadSafe.getInstance().getOia());

        ClasseJustinoSingletonThreadSafe2 oia2 = ClasseJustinoSingletonThreadSafe2.getInstance();
        System.out.println(oia2.getOia());
        ClasseJustinoSingletonThreadSafe2.getInstance().setOia("Teste 2");
        System.out.println(oia2.getOia());
        System.out.println(ClasseJustinoSingletonThreadSafe2.getInstance().getOia());

        ClasseJustinoSingletonThreadSafe3 oia3 = ClasseJustinoSingletonThreadSafe3.getInstance();
        System.out.println(oia3.getOia());
        ClasseJustinoSingletonThreadSafe3.getInstance().setOia("Teste 3");
        System.out.println(oia3.getOia());
        System.out.println(ClasseJustinoSingletonThreadSafe3.getInstance().getOia());

        ClasseJustinoSingletonThreadSafe4 oia4 = ClasseJustinoSingletonThreadSafe4.getInstance();
        System.out.println(oia4.getOia());
        ClasseJustinoSingletonThreadSafe4.getInstance().setOia("Teste 4");
        System.out.println(oia4.getOia());
        System.out.println(ClasseJustinoSingletonThreadSafe4.getInstance().getOia());

    }

}
