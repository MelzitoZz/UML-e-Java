package br.edu.unifei.ecot12.prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avaliacao a = new Avaliacao();
        Scanner s = new Scanner(System.in);
        System.out.println("matricula");
        a.setMatricula(s.nextLong());
        System.out.println("nota1");
        a.setNota1(s.nextFloat());
        a.setMatricula(s.nextLong());
        System.out.println("nota2");
        a.setNota2(s.nextFloat());
        if(a.media()<Avaliacao.NOTA_MINIMA){
            System.out.println("substitutiva");
            a.setSubstitutiva(0);
        }
        System.out.println("frequencia");
        a.setFrequencia(s.nextFloat());
        System.out.println("media:"+a.media());
        System.out.println(a.aprovacao());
        s.close();
    }
}
