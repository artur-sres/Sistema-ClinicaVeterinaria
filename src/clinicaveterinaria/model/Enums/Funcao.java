/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clinicaveterinaria.model.Enums;

/**
 *
 * @author Artur
 */
public enum Funcao {
    COMPANHIA("Companhia"),
    GUARDA("Guarda"),
    POLICIAL("Policial"),
    GUIA("Guia"),
    PASTOR("Pastor");

    private final String descricao;

    Funcao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
