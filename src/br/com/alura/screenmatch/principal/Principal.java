package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println( "Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        Serie outlander;
        outlander = new Serie("outlander", 2016);
        episodio.setTotalVisualizacoes(300);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listDeFilmes = new ArrayList<>();
        listDeFilmes.add(filmeDoPaulo);
        listDeFilmes.add(meuFilme);
        System.out.println("Tamanho d lista " + listDeFilmes.size());
        System.out.println("Primeiro filme " + listDeFilmes.get(0).getNome());
        System.out.println(listDeFilmes);
        System.out.println("toString do filme " + listDeFilmes.get(0).toString());



    }
}