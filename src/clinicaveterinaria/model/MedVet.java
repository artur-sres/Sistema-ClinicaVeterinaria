
package clinicaveterinaria.model;

import java.util.ArrayList;

public class MedVet extends Pessoa {
    private ArrayList<Consulta> agendaConsultas;

    public MedVet(ArrayList<Consulta> agendaConsultas, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.agendaConsultas = agendaConsultas;
    }
    
    
}
