package com.justino.testesingleton;

/*
   Effective Java book (Item 3) by Joshua Block
 */
public enum ClasseJustinoSingletonThreadSafe4 {

    INSTANCE;

    public static ClasseJustinoSingletonThreadSafe4 getInstance(){
        return INSTANCE;
    }

    private String oia;

    private ClasseJustinoSingletonThreadSafe4(){
        oia = "Iniciado..";
    }

    public String getOia() {
        return oia;
    }

    public void setOia(String oia) {
        this.oia = oia;
    }
}
