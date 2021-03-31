package com.justino.testefinal;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class TesteMetodoFinal {

    private static String varStatic = "aaa";
    static Instant i;
    static {
        varStatic = "bbb";


    }

    public static void main(String[] args) {
        String time = "2021-03-18T08:39:53.357053+0300";
        /*if (!time.substring(time.length()-1).equals("Z"))
            time += "Z";*/
         TemporalAccessor t = DateTimeFormatter.BASIC_ISO_DATE.parse(time);
        System.out.println(Instant.from(t));
        //System.out.println(OffsetDateTime.ofInstant(i, ZoneId.of("+0300")));
    }
    public static String getVarStatic(){
        return varStatic;
    }

    private final String testeVar = "aaa";

    public String metodoNormal(){
        //testeVar = "oia";
        return "oia";

    }

    public /*final*/ String metodoFinal(){
        return "oia";
    }
}

class TesteMetodoInterno extends TesteMetodoFinal {

    @Override
    public String metodoNormal(){
        return "oia nada";
    }

    @Override
    public String metodoFinal(){
        return "oia nada";
    }

}

