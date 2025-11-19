package com.bychaves.maratonajava.javacore.Kenum.test;

import com.bychaves.maratonajava.javacore.Kenum.dominio.Cliente;
import com.bychaves.maratonajava.javacore.Kenum.dominio.TipoCliente;
import com.bychaves.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Seu Madruga", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Seu Madruga", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
