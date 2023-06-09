package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super();
        this.setNome(nome, anoDeLancamento);
    }

    public String getDiretor(){
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;


    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";

    }
}



