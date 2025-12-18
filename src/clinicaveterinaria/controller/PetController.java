package clinicaveterinaria.controller;

import clinicaveterinaria.model.Enums.Sexo;
import clinicaveterinaria.model.Pet;
import clinicaveterinaria.model.Tutor;
import static clinicaveterinaria.util.ValidarDados.validarDados;
import clinicaveterinaria.view.CadastrarTutor;
import java.time.LocalDate;
import java.util.ArrayList;

public class PetController {
    private static ArrayList<Pet> listaPets = new ArrayList<>();
    
    public static void cadastrarPet(Tutor tutor, String nome, String especie, String raca, String sexo, String pesoTexto, LocalDate nascimento, String alergias, String temperamento, boolean vacinado, boolean castrado) throws Exception{
        validarDados(nome, raca, alergias, temperamento);
        
        double peso = 0.0;
        try {
            peso = Double.parseDouble(pesoTexto.replace(",", "."));
        } catch (NumberFormatException e) {
            throw new Exception("O peso informado é inválido!");
        }
        
        Pet novoPet = new Pet(nome, nascimento, Sexo.MACHO, castrado, vacinado, peso, temperamento, raca, alergias, tutor);
        tutor.adicionarPet(novoPet);
        listaPets.add(novoPet);
    }
    
        public static void cadastrarPet(String nome, String especie, String raca, String sexo, String pesoTexto, LocalDate nascimento, String alergias, String temperamento, boolean vacinado, boolean castrado) throws Exception{
        validarDados(nome, raca, alergias, temperamento);
        
        double peso = 0.0;
        try {
            peso = Double.parseDouble(pesoTexto.replace(",", "."));
        } catch (NumberFormatException e) {
            throw new Exception("O peso informado é inválido!");
        }
        
        
        CadastrarTutor telaTutor = new CadastrarTutor();
        telaTutor.setVisible(true);
                
        Tutor tutor = TutorController.listaTutores.get(TutorController.listaTutores.size());
        Pet novoPet = new Pet(nome, nascimento, Sexo.MACHO, castrado, vacinado, peso, temperamento, raca, alergias, tutor);
        tutor.adicionarPet(novoPet);
        listaPets.add(novoPet);
    }
}

