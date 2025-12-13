/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria.model;

import clinicaveterinaria.model.Enums.*;
import clinicaveterinaria.model.Enums.Sexo;
import java.time.LocalDate;
/**
 *
 * @author Artur
 */
public class Cachorro extends Pet {
    Porte porte;
    Funcao funcao;
    Fucinho fucinho;

    public Cachorro(String nome, LocalDate dataNascimento, Sexo sexo, boolean isCastrado, double peso, String temperamento,String raca, Tutor tutor, Porte porte, Funcao funcao, Fucinho fucinho) {
        super(nome, dataNascimento, sexo, isCastrado, peso, temperamento, raca, tutor);
        this.porte = porte;
        this.funcao = funcao;
        this.fucinho = fucinho;
    }
    
}
