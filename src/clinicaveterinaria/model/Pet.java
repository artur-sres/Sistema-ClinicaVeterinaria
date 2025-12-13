package clinicaveterinaria.model;
import clinicaveterinaria.model.Enums.Sexo;
import java.time.LocalDate;
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
    protected Tutor tutor;
    //protected ArrayList<Consulta> consulta;
    //protected ArrayList<Vacina> Vacinas;

    public Pet(String nome, LocalDate dataNascimento, int idade, Sexo sexo, boolean isCastrado, double peso, String temperamento, Tutor tutor) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.isCastrado = isCastrado;
        this.peso = peso;
        this.temperamento = temperamento;
        this.tutor = tutor;
    }

}
