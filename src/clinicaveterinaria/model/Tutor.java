package clinicaveterinaria.model;
import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String cpf;
    private ArrayList<Pet> animais;

    public Tutor(String nome, String email, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCPF() {
        return cpf;
    }
    public ArrayList<Pet> getAnimais() {
        return animais;
    }
    
    
}
