package Main;

import Excecao.ErroDeConversaoDeAnoException;
import Model.Title;
import Model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Quando o programa faz uma requisição HTTP pela Internet, várias coisas podem dar errado, o que são chamados de exceções
        // O throws é uma declaração de exceções de um metodo, portanto, se der erro de IOException (erro de entrada/saída) ou InterruptedException (se o processo for interrompido) o programa encerra.

        Scanner scan = new Scanner(System.in);
        String busca = "";
        String apiKey = System.getenv("OMDB_API_KEY"); // API Key
        List<Title> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() // deixa o json indentado
                .create();

        while (true){
            System.out.println("Qual filme está buscando?");
            busca = scan.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t="+busca.replace(" ","+")+"&apikey="+apiKey;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()// cria o construtor
                        .uri(URI.create(endereco)) ///  define a url
                        .build(); // finaliza a requisição

                HttpResponse<String> response = client // define a resposta com String
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body()); // mostra o corpo da resposta
                String json = response.body();



                TitleOmdb meuTituloOmdb = gson.fromJson(json, TitleOmdb.class);

                // Instancia o titulo
                Title meuTitulo = new Title(meuTituloOmdb);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch(NumberFormatException e){
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }


        }

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou");


        // Link Java Doc HTTP REQUEST: https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
        // Link Java Doc HTTP RESPONSE: https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpResponse.html

        // OMDbAPI doc: https://www.omdbapi.com

        // Gson: https://mvnrepository.com/artifact/com.google.code.gson/gson neste projeto em especifico, foi baixado o gson
    }
}
