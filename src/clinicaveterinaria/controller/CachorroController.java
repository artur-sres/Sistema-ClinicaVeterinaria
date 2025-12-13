/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria.controller;

import clinicaveterinaria.model.Cachorro;
import clinicaveterinaria.model.Enums.Fucinho;
import clinicaveterinaria.model.Enums.Funcao;
import clinicaveterinaria.model.Enums.Porte;
import clinicaveterinaria.model.Enums.Sexo;
import clinicaveterinaria.model.Pet;
import clinicaveterinaria.model.Tutor;
import java.time.LocalDate;

/**
 *
 * @author Artur
 */
public class CachorroController {
    public static void cadastrarCachorro(String nome, LocalDate dataNascimento, Sexo sexo, boolean isCastrado, double peso, String temperamento,String raca, Tutor tutor, Porte porte, Funcao funcao, Fucinho fucinho){
        Pet cachorro = new Cachorro(nome, dataNascimento, sexo, isCastrado, peso, temperamento, raca, tutor, porte, funcao, fucinho);
    }
}
