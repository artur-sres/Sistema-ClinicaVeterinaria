/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria.util;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import org.apache.commons.validator.routines.EmailValidator;

public class ValidarDados {
        
    public static void validarDados(String nome, String email, String telefone) throws Exception{
        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
            throw new Exception("Preencha todos os campos obrigatórios!");
        }
        ValidarDados.validarNome(nome);
        ValidarDados.validarEmail(email);
        ValidarDados.validarTelefone(telefone);
    }
    
    public static void validarDados(String nome, String email, String telefone, String endereco, String cpf) throws Exception {
        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || cpf.isEmpty()) {
            throw new Exception("Preencha todos os campos obrigatórios!");
        }
        
        ValidarDados.validarNome(nome);
        ValidarDados.validarEmail(email);
        ValidarDados.validarTelefone(telefone);
       
        CPFValidator cpfValidator = new CPFValidator(); 
        try { 
            cpfValidator.assertValid(cpf); 
        } catch (InvalidStateException e) { 
            throw new Exception("O CPF digitado é inválido!");
        }
    }
    
    private static void validarNome(String nome) throws Exception{
        if (!nome.matches("[A-Za-zÀ-ü\\s]+")) {
            throw new Exception("O nome digitado é inválido!");
        }
    }
    
    private static void validarEmail(String email) throws Exception{
        EmailValidator emailVal = EmailValidator.getInstance();
        if (!emailVal.isValid(email)) {
            throw new Exception("O e-mail digitado é inválido!");
        }
    }
    
    private static void validarTelefone(String telefone) throws Exception{
        if (telefone.matches(".*[A-Za-z].*")) {
        throw new Exception("O telefone digitado é inválido!");
        }
        
        String foneLimpo = telefone.replaceAll("\\D", ""); 
        if (foneLimpo.length() < 10 || foneLimpo.length() > 11) {
            throw new Exception("O telefone digitado é inválido!");
        }
    }
}
