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
        
        Tutor salsicha = new Tutor("Salchicha", "salsicha@hotmail", "Rua A, 123", "Mistérios S.A.", "08957033351");
        
        new CadastrarCachorro(salsicha).setVisible(true);
        
    }
}   
