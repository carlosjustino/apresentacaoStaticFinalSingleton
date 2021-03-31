package com.justino.testefinal;

public /*final*/ class TesteClasseFinal {

    private String oia = "Sou uma classe final";
}

class TesteInterno {

}
class TesteInternoSemErro extends TesteInterno{

}

class TesteInternoComErro extends TesteClasseFinal{

}

