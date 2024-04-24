package principal;

import com.google.gson.*;
import consulta.ConsultaExchangerateAPI;
import menu.MenuPrincipal;
import modelo.TabelaMoedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {

    public static void main(String[] args) {

        MenuPrincipal.opcoes();
        ConsultaExchangerateAPI.consulta("usd");

    }
}
