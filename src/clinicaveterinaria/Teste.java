/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;

import clinicaveterinaria.controller.TutorController;
import clinicaveterinaria.controller.VeterinarioController;
import clinicaveterinaria.model.MedVet;
import clinicaveterinaria.model.Tutor;

/**
 *
 * @author Artur
 */
public class Teste {
    public static void testeTutores(){
        // 1. Região Sudeste (SP)
        TutorController.listaTutores.add(new Tutor(
            "Ana Clara Souza", 
            "ana.clara@gmail.com", 
            "(11) 98888-1234", 
            "Av. Paulista, 1000 - SP", 
            "123.456.789-00"
        ));

        // 2. Região Sudeste (RJ)
        TutorController.listaTutores.add(new Tutor(
            "Bruno Mendes", 
            "bruno.mendes@hotmail.com", 
            "(21) 97777-5678", 
            "Rua Copacabana, 50 - RJ", 
            "234.567.890-11"
        ));

        // 3. Região Sul (PR)
        TutorController.listaTutores.add(new Tutor(
            "Carla Ferreira", 
            "carla.ferreira@outlook.com", 
            "(41) 99999-4321", 
            "Rua das Flores, 123 - Curitiba", 
            "345.678.901-22"
        ));

        // 4. Região Nordeste (BA)
        TutorController.listaTutores.add(new Tutor(
            "Daniel Oliveira", 
            "daniel.oli@yahoo.com.br", 
            "(71) 98888-9876", 
            "Av. Oceânica, 500 - Salvador", 
            "456.789.012-33"
        ));

        // 5. Região Nordeste (CE - Fortaleza)
        TutorController.listaTutores.add(new Tutor(
            "Eduarda Lima", 
            "duda.lima@gmail.com", 
            "(85) 99111-2222", 
            "Rua Beira Mar, 200 - Fortaleza", 
            "567.890.123-44"
        ));

        // 6. Região Norte (AM)
        TutorController.listaTutores.add(new Tutor(
            "Fábio Costa", 
            "fabio.costa@bol.com.br", 
            "(92) 98111-3333", 
            "Av. Amazonas, 100 - Manaus", 
            "678.901.234-55"
        ));

        // 7. Região Centro-Oeste (DF)
        TutorController.listaTutores.add(new Tutor(
            "Gabriela Rocha", 
            "gabi.rocha@uol.com.br", 
            "(61) 99222-4444", 
            "Asa Norte, Bloco C - Brasília", 
            "789.012.345-66"
        ));

        // 8. Região Sudeste (MG)
        TutorController.listaTutores.add(new Tutor(
            "Henrique Silva", 
            "henrique.silva@gmail.com", 
            "(31) 99333-5555", 
            "Av. Afonso Pena, 300 - BH", 
            "890.123.456-77"
        ));

        // 9. Região Sul (RS)
        TutorController.listaTutores.add(new Tutor(
            "Isabela Martins", 
            "isa.martins@terra.com.br", 
            "(51) 99444-6666", 
            "Rua dos Andradas, 40 - Porto Alegre", 
            "901.234.567-88"
        ));

        // 10. Região Nordeste (PE)
        TutorController.listaTutores.add(new Tutor(
            "João Pedro Alves", 
            "jp.alves@gmail.com", 
            "(81) 99555-7777", 
            "Av. Boa Viagem, 1500 - Recife", 
            "012.345.678-99"
        ));

        // 11. Região Centro-Oeste (GO)
        TutorController.listaTutores.add(new Tutor(
            "Karina Santos", 
            "kakasan@hotmail.com", 
            "(62) 98123-4567", 
            "Rua 9, Setor Oeste - Goiânia", 
            "111.222.333-00"
        ));

        // 12. Região Norte (PA)
        TutorController.listaTutores.add(new Tutor(
            "Lucas Pereira", 
            "lucas.pereira@gmail.com", 
            "(91) 98765-4321", 
            "Av. Nazaré, 20 - Belém", 
            "222.333.444-11"
        ));

        // 13. Região Sudeste (ES)
        TutorController.listaTutores.add(new Tutor(
            "Mariana Costa", 
            "mari.costa@outlook.com", 
            "(27) 99876-5432", 
            "Rua da Praia, 10 - Vitória", 
            "333.444.555-22"
        ));

        // 14. Região Sul (SC)
        TutorController.listaTutores.add(new Tutor(
            "Nicolas Ribeiro", 
            "nick.ribeiro@yahoo.com", 
            "(48) 99123-0987", 
            "Av. Beira Mar Norte, 800 - Florianópolis", 
            "444.555.666-33"
        ));

        // 15. Região Nordeste (RN)
        TutorController.listaTutores.add(new Tutor(
            "Olívia Nogueira", 
            "olivia.nog@gmail.com", 
            "(84) 98888-1111", 
            "Ponta Negra, 22 - Natal", 
            "555.666.777-44"
        ));

        // 16. Região Nordeste (MA)
        TutorController.listaTutores.add(new Tutor(
            "Paulo Ricardo", 
            "paulo.ricardo@bol.com.br", 
            "(98) 98111-2222", 
            "Rua do Sol, 5 - São Luís", 
            "666.777.888-55"
        ));

        // 17. Região Centro-Oeste (MT)
        TutorController.listaTutores.add(new Tutor(
            "Quintino Bocaiúva", 
            "quintino@uol.com.br", 
            "(65) 99222-3333", 
            "Av. do CPA, 1000 - Cuiabá", 
            "777.888.999-66"
        ));

        // 18. Região Sudeste (SP - Interior)
        TutorController.listaTutores.add(new Tutor(
            "Rafaela Siqueira", 
            "rafa.siqueira@gmail.com", 
            "(19) 99333-4444", 
            "Rua Barão, 500 - Campinas", 
            "888.999.000-77"
        ));

        // 19. Região Nordeste (PB)
        TutorController.listaTutores.add(new Tutor(
            "Sérgio Malandro", 
            "serjao@teste.com", 
            "(83) 99444-5555", 
            "Av. Epitácio Pessoa, 200 - João Pessoa", 
            "999.000.111-88"
        ));

        // 20. Região Norte (TO)
        TutorController.listaTutores.add(new Tutor(
            "Tatiane Araújo", 
            "tati.araujo@gmail.com", 
            "(63) 99555-6666", 
            "Quadra 104 Sul, Lote 10 - Palmas", 
            "000.111.222-99"
        ));
    }

    public static void testeVeterinarios(){
        VeterinarioController.listaVeterinarios.add(new MedVet(
        "Leticia Nascimento",
        "Leticia@gmail.com",
        "88940028922"
        ));

        // 1. Veterinário Cirurgião
        VeterinarioController.listaVeterinarios.add(new MedVet(
            "Dr. Ricardo Gomes",
            "ricardo.vet@clinica.com",
            "11988887777"
        ));

        // 2. Veterinária Dermatologista
        VeterinarioController.listaVeterinarios.add(new MedVet(
            "Dra. Amanda Souza",
            "amanda.dermato@clinica.com",
            "21977776666"
        ));

        // 3. Veterinário Ortopedista
        VeterinarioController.listaVeterinarios.add(new MedVet(
            "Dr. Fernando Lima",
            "fernando.orto@clinica.com",
            "31966665555"
        ));

        // 4. Especialista em Felinos
        VeterinarioController.listaVeterinarios.add(new MedVet(
            "Dra. Beatriz Rocha",
            "bia.cats@clinica.com",
            "41955554444"
        ));

        // 5. Clínico Geral
        VeterinarioController.listaVeterinarios.add(new MedVet(
            "Dr. Roberto Alves",
            "roberto.geral@clinica.com",
            "51944443333"
        ));
    }
}
