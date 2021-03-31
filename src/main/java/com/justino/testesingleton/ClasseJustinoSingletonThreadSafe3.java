package com.justino.testesingleton;

/*
  Initialization on Demand
 */
public class ClasseJustinoSingletonThreadSafe3 {

    private static class InstanceHolder {
        private static final ClasseJustinoSingletonThreadSafe3 INSTANCE = new ClasseJustinoSingletonThreadSafe3();
    }

    public static ClasseJustinoSingletonThreadSafe3 getInstance(){
        return InstanceHolder.INSTANCE;
    }

    private String oia = null;

    private ClasseJustinoSingletonThreadSafe3(){
        oia = "Iniciado..";
    }

    public String getOia() {
        return oia;
    }

    public void setOia(String oia) {
        this.oia = oia;
    }
}
