/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clinicaveterinaria.model.Enums;

/**
 *
 * @author Artur
 */
public enum Fucinho {
    MESOCEFALICO("Mesocefálico"),
    BRAQUICEFALICO("Braquicefálico"),
    DOLICOCEFALICO("Dolicocefálico");    

    private final String descricao;

    Fucinho(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
