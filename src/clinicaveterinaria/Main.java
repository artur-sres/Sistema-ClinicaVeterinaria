package clinicaveterinaria;

import clinicaveterinaria.controller.TutorController;
import clinicaveterinaria.model.Tutor;
import clinicaveterinaria.view.CadastrarTutor;
import clinicaveterinaria.view.VisualizarTutor;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {       
        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }
        
        //VisualizarTutor tela = new VisualizarTutor(TutorController.listaTutores.get(0));
        //tela.setVisible(true);
    }
}   
