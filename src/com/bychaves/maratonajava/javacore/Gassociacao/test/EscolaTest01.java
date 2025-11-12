package com.bychaves.maratonajava.javacore.Gassociacao.test;

import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafales");
        Professor[] professores = {professor};
        Escola escola = new Escola("Benito Juárez", professores);

        escola.imprime();
    }
}
