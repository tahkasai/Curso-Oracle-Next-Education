package Main;

import Model.Movie;
import Model.Serie;
import Model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args){
        // Séries
        Serie itACoisa = new Serie("Bem vindo a Derry",2025,true,50,5,1,9,true,100);

        // Filmes
        Movie osOutros = new Movie(110,760,10,false,2001,"Os outros","Alejandro Amenábar");
        Movie inception = new Movie(148, 1200, 5400, true, 2010, "Inception", "Christopher Nolan");
        Movie interestellar = new Movie(169, 980, 4600, true, 2014, "Interstellar", "Christopher Nolan");
        Movie parasite = new Movie(132, 860, 4300, false, 2019, "Parasite", "Bong Joon-ho");
        Movie spiritedAway = new Movie(125, 1500, 7200, true, 2001, "Spirited Away", "Hayao Miyazaki");
        Movie theMatrix = new Movie(136, 2000, 9800, false, 1999, "The Matrix", "Wachowski Sisters");

        // Lista de Assistidos
        ArrayList<Title> lista = new ArrayList<>();

        lista.add(osOutros);
        lista.add(inception);
        lista.add(interestellar);
        lista.add(parasite);
        lista.add(spiritedAway);
        lista.add(theMatrix);
        lista.add(itACoisa);

        for (Title item : lista) { // for-each: Tipo variável : coleção
            System.out.println(item.getNome());
            if (item instanceof Movie filme){
                System.out.println("Classificação: "+filme.getClassificacao());
            }
        }

        // Buscar artistas

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Marina Sena");
        buscaPorArtista.add("Ludoviajante");
        buscaPorArtista.add("Christopher Nolan");
        buscaPorArtista.add("Hayao Miyazaki");
        buscaPorArtista.add("Taylor Swift");
        buscaPorArtista.add("Bruno Mars");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Lista ordenada por ano");
        lista.sort(Comparator.comparing(Title::getAnoDeLancamento));
        System.out.println(lista);
    }
}
