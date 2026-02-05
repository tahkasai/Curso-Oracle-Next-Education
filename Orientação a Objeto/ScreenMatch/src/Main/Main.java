package Main;

import Model.Movie;
import Model.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Séries
        Serie itACoisa = new Serie("Bem vindo a Derry",2025,true,50,5,1,9,true,100);

        // Filmes
        Movie osOutros = new Movie(110,760,10,false,2001,"Os outros","Alejandro Amenábar");
        Movie inception = new Movie(148, 1200, 5400, true, 2010, "Inception", "Christopher Nolan");
        Movie interestellar = new Movie(169, 980, 4600, true, 2014, "Interstellar", "Christopher Nolan");
        Movie parasite = new Movie(132, 860, 4300, false, 2019, "Parasite", "Bong Joon-ho");
        Movie spiritedAway = new Movie(125, 1500, 7200, true, 2001, "Spirited Away", "Hayao Miyazaki");
        Movie theMatrix = new Movie(136, 2000, 9800, false, 1999, "The Matrix", "Wachowski Sisters");

        // ArrayList de filmes
        ArrayList<Movie> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(osOutros);
        listaDeFilmes.add(inception);
        listaDeFilmes.add(interestellar);
        listaDeFilmes.add(parasite);
        listaDeFilmes.add(spiritedAway);
        listaDeFilmes.add(theMatrix);

        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme da Lista: "+listaDeFilmes.get(0).getNome());
        System.out.println("toString "+listaDeFilmes.toString());
        System.out.println("------------------------------------");
        System.out.println("Sua lista");
        System.out.println("------------------------------------");
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).getNome());
        }

//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//
//        calculadora.inclui(osOutros);
//        calculadora.inclui(itACoisa);
//
//        System.out.println("Sua lista\n-------------------------\n"+itACoisa.getNome()+"\n"+osOutros.getNome()+"\nDuração total: "+calculadora.getTempoTotal()+" minutos");
//
//        Recommendation filtroDeRecomentacao = new Recommendation();
//
//        filtroDeRecomentacao.filtra(osOutros);
//
//        Episode episodio = new Episode(1,"capitulo 1",itACoisa,300);
//        filtroDeRecomentacao.filtra(episodio);
    }
}