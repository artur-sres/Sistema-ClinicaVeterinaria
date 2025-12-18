package clinicaveterinaria.controller;
import clinicaveterinaria.model.Tutor;
import static clinicaveterinaria.util.ValidarDados.validarDados;
import java.util.ArrayList;

public class TutorController {
    public static ArrayList<Tutor> listaTutores = new ArrayList<>();
    
    public static void cadastrarTutor(String nome, String email, String telefone, String endereco, String cpf)throws Exception{
        validarDados(nome, email, telefone, endereco, cpf);
        Tutor novoTutor = new Tutor(nome, email, telefone, endereco, cpf);
        listaTutores.add(novoTutor);
    }
    
    public static void editarTutor(Tutor tutor, String nome, String email, String telefone, String endereco, String cpf)throws Exception{
        validarDados(nome, email, telefone, endereco, cpf);
        tutor.setNome(nome);
        tutor.setEmail(email);
        tutor.setTelefone(telefone);
        tutor.setEndereco(endereco);
        tutor.setCpf(cpf);
    }
}