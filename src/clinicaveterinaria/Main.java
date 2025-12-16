package clinicaveterinaria;

import clinicaveterinaria.controller.TutorController;
import clinicaveterinaria.model.Tutor;
import clinicaveterinaria.view.MenuInicial;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {       
        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }
        // Adicionando Tutor 1: O "Padrão"
        TutorController.listaTutores.add(new Tutor(
            "Leticia Nascimento", 
            "Leticia@email.com", 
            "(11) 99999-1234", 
            "Rua das Flores, 123 - SP", 
            "123.456.789-00"
        ));

        // Adicionando Tutor 2: O "Alternativo"
        TutorController.listaTutores.add(new Tutor(
            "Pedro Lucas", 
            "Pedro@teste.com", 
            "(21) 98888-5555", 
            "Av. Paulista, 1000 - Apto 40", 
            "987.654.321-11"
        ));

        // Adicionando Tutor 3: Nome Curto
        TutorController.listaTutores.add(new Tutor(
            "Thalia Silva", 
            "lia.yu@vetmail.com", 
            "(41) 97777-0000", 
            "Praça Central, S/N", 
            "111.222.333-44"
        ));
        
        TutorController.listaTutores.add(new Tutor(
            "Ilbs Filho", 
            "lia.yu@vetmail.com", 
            "(41) 97777-0000", 
            "Praça Central, S/N", 
            "111.222.333-44"
        ));
        
        TutorController.listaTutores.add(new Tutor(
            "Artur Saraiva Rabelo", 
            "lia.yu@vetmail.com", 
            "(41) 97777-0000", 
            "Praça Central, S/N", 
            "111.222.333-44"
        ));
        
        MenuInicial menu = new MenuInicial();
        menu.setVisible(true);
    }
}   
