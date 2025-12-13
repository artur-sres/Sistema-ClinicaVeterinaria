package clinicaveterinaria;

import clinicaveterinaria.model.Tutor;
import clinicaveterinaria.view.CadastrarTutor;
import clinicaveterinaria.view.VisualizarTutor;
import clinicaveterinaria.view.CadastrarCachorro;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {       
        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }
        CadastrarTutor telaTutor = new CadastrarTutor();
        telaTutor.setVisible(true);
        
    }
}   
