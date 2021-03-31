package com.justino.testesingleton;

/*
 Early Initialization
 */
public class ClasseJustinoSingletonThreadSafe2 {

    private static ClasseJustinoSingletonThreadSafe2 INSTANCE = new ClasseJustinoSingletonThreadSafe2();

    public static ClasseJustinoSingletonThreadSafe2 getInstance(){
        return INSTANCE;
    }

    private String oia = null;

    private ClasseJustinoSingletonThreadSafe2(){
        oia = "Iniciado..";
    }

    public String getOia() {
        return oia;
    }

    public void setOia(String oia) {
        this.oia = oia;
    }
}
