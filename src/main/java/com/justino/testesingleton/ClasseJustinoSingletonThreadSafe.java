package com.justino.testesingleton;

public class ClasseJustinoSingletonThreadSafe {

    private static ClasseJustinoSingletonThreadSafe INSTANCE;

    private String oia = null;

    private ClasseJustinoSingletonThreadSafe(){
        oia = "Iniciado..";
    }

    public static ClasseJustinoSingletonThreadSafe getInstance(){
        if (INSTANCE == null){
            synchronized (ClasseJustinoSingletonThreadSafe.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ClasseJustinoSingletonThreadSafe();
                }
            }
        }
        return INSTANCE;
    }

    public String getOia() {
        return oia;
    }

    public void setOia(String oia) {
        this.oia = oia;
    }
}
