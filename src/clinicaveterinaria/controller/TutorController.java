package clinicaveterinaria.controller;
import clinicaveterinaria.model.Tutor;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import clinicaveterinaria.view.CadastrarCachorro;
import org.apache.commons.validator.routines.EmailValidator;

public class TutorController {
    public static void cadastrarTutor(String nome, String email, String telefone, String endereco, String cpf)throws Exception{
        validarDados(nome, email, telefone, endereco, cpf);
        Tutor novoTutor = new Tutor(nome, email, telefone, endereco, cpf);
        CadastrarCachorro telaCachorro = new CadastrarCachorro(novoTutor);
        telaCachorro.setVisible(true);
    }
    
    private static void validarDados(String nome, String email, String telefone, String endereco, String cpf) throws Exception {
        if (nome.isEmpty() || email.isEmpty() || endereco.isEmpty() || cpf.isEmpty()) {
            throw new Exception("Preencha todos os campos obrigatórios!");
        }

        if (!nome.matches("[A-Za-zÀ-ü\\s]+")) {
            throw new Exception("O nome digitado é inválido!");
        }

        EmailValidator emailVal = EmailValidator.getInstance();
        if (!emailVal.isValid(email)) {
            throw new Exception("O e-mail digitado é inválido!");
        }

        if (telefone.matches(".*[A-Za-z].*")) {
        throw new Exception("O telefone digitado é inválido!");
        }
        
        String foneLimpo = telefone.replaceAll("\\D", ""); 
        if (foneLimpo.length() < 10 || foneLimpo.length() > 11) {
            throw new Exception("O telefone digitado é inválido!");
        }

        CPFValidator cpfValidator = new CPFValidator(); 
        try { 
            cpfValidator.assertValid(cpf); 
        } catch (InvalidStateException e) { 
            throw new Exception("O CPF digitado é inválido!");
        }
    }
}


