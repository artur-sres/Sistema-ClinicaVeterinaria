package clinicaveterinaria.model;

import clinicaveterinaria.model.Enums.Porte;
import clinicaveterinaria.model.Enums.Sexo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

public class Pet {
    protected String nome;
    protected LocalDate dataNascimento;
    protected int idade;
    protected Sexo sexo;
    protected boolean isCastrado;
    protected Porte porte;
    protected double peso;
    protected String temperamento;
    protected String raca;
    protected Tutor tutor;
    protected ArrayList<Consulta> consultasAgendadas;
    protected ArrayList<Consulta> consultasHistorico;


    public Pet(String nome, LocalDate dataNascimento, Sexo sexo, boolean isCastrado, Porte porte, double peso, String temperamento, String raca, Tutor tutor) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        LocalDate hoje = LocalDate.now();
        this.idade = Period.between(this.dataNascimento, hoje).getYears();
        this.sexo = sexo;
        this.isCastrado = isCastrado;
        this.porte = porte;
        this.peso = peso;
        this.temperamento = temperamento;
        this.raca = raca;
        this.tutor = tutor;
        this.consultasAgendadas = new ArrayList<>();
        this.consultasHistorico = new ArrayList<>();
    }
    
    
    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        setIdade(Period.between(this.dataNascimento, hoje).getYears());
        return this.idade;
    }
}
