package view;

import model.Conta;
import model.ContaPoupanca;
import model.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta atleta1 = new Triatleta("Joao", "Rua mae cabloco");

        System.out.println("Nome: " + atleta1.getNome());
        System.out.println("Endereço: " + atleta1.getEndereco());
        atleta1.correrDeBiscicleta();
        atleta1.nadar();
        atleta1.correr();

        Conta conta1 = new Conta(1, "Jorge");

        System.out.println("Saldo atual:" + conta1.getSaldo());
        conta1.depositar(962.2);
        System.out.println("Saldo atual:" + conta1.getSaldo());

        conta1.reajuste(0.2);
        System.out.println("Saldo atual:" + conta1.getSaldo());

        System.out.println("Conta poupança: ");

        Conta conta2 = new ContaPoupanca(2,"Pedro");

        System.out.println("Saldo atual:" + conta2.getSaldo());
        conta2.depositar(540);
        System.out.println("Saldo atual:" + conta2.getSaldo());

        conta2.reajuste(0.2);
        System.out.println("Saldo atual:" + conta2.getSaldo());

    }
}