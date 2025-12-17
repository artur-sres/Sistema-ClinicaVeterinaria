package clinicaveterinaria;

import clinicaveterinaria.controller.TutorController;
import clinicaveterinaria.model.Tutor;
import clinicaveterinaria.view.Menu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {       
        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }

        TutorController.listaTutores.add(new Tutor(
            "Artur Saraiva Rabelo", 
            "Artur@gmail.com", 
            "(99) 98166-4707", 
            "Morada Nova - CE", 
            "089.570.333-51"
        ));
      
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}   
