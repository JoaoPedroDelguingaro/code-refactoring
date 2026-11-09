package br.com.jptech.command;

import br.com.jptech.client.ClientHttpConfiguration;
import br.com.jptech.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigosCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.listarAbrigos();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

