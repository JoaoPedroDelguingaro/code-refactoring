package br.com.jptech.command;

import br.com.jptech.client.ClientHttpConfiguration;
import br.com.jptech.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.importaPetsDoAbrigo();
        }catch (InterruptedException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}

