/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clinicaveterinaria.model.Enums;

/**
 *
 * @author Artur
 */
public enum Porte {
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande"),
    GIGANTE("Gigante");

    private final String descricao;

    Porte(String descricao) {
        this.descricao = descricao;
    }
    
    public String toString() {
        return descricao;
    }

}
