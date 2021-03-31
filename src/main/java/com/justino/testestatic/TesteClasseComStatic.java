package com.justino.testestatic;

public class TesteClasseComStatic {
    protected static String variavelStatic;

    static {
        variavelStatic = "teste 01";
    }

    public String getVariavelStatic(){
        return variavelStatic;
    }

    public void setVariavelStatic(String variavelStatic) {
        TesteClasseComStatic.variavelStatic = variavelStatic;
    }
}
