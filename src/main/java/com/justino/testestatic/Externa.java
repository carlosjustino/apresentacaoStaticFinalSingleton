package com.justino.testestatic;

public class Externa {
    public static class Estatica {
        public void imprime() {
            System.out.println("método da classe aninhada estática");
        }
    }
    public class NaoEstatica {
        public void imprime() {
            System.out.println("método da classe aninhada NÃO estática");
        }
    }
}
