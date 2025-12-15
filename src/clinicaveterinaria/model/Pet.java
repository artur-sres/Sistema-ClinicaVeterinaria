package clinicaveterinaria.model;
import clinicaveterinaria.model.Enums.Sexo;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.time.LocalDate.time;
//import java.util.ArrayList;


public abstract class Pet {
    protected String nome;
    protected LocalDate dataNascimento;
    protected int idade;
    protected Sexo sexo;
    protected boolean isCastrado;
    protected double peso;
    protected String temperamento;
    protected String raca;
    protected Tutor tutor;
    protected ArrayList<Consulta> consulta;

    public Pet(String nome, LocalDate dataNascimento, Sexo sexo, boolean isCastrado, double peso, String temperamento, String raca, Tutor tutor) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.isCastrado = isCastrado;
        this.peso = peso;
        this.temperamento = temperamento;
        this.raca = raca;
        this.tutor = tutor;
    }

}
