package model;

public class Triatleta extends Pessoa implements Cisclista, Corredor, Nadador{

    public Triatleta(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public void correrDeBiscicleta() {
        System.out.println(getNome() + " Está correndo de biscicleta");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " Está correndo");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " Está nadando");
    }
}
