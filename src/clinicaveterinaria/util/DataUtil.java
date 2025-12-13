package clinicaveterinaria.util;

import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class DataUtil {

    public static void inicializarCombos(JComboBox cmbDia, JComboBox cmbMes, JComboBox cmbAno) {
        cmbDia.removeAllItems();
        cmbMes.removeAllItems();
        cmbAno.removeAllItems();

        for (int i = 1; i <= 31; i++) {
            cmbDia.addItem(String.format("%02d", i));
        }

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        cmbMes.setModel(new DefaultComboBoxModel<>(meses));

        // 3. Anos (De 1990 até hoje)
        int anoAtual = LocalDate.now().getYear();
        for (int i = 1990; i <= anoAtual; i++) {
            cmbAno.addItem(String.valueOf(i));
        }
    }

    public static LocalDate montarData(JComboBox cmbDia, JComboBox cmbMes, JComboBox cmbAno) throws Exception {
        try {
            int dia = Integer.parseInt(cmbDia.getSelectedItem().toString());
            int mes = cmbMes.getSelectedIndex() + 1; // +1 porque Janeiro é 0
            int ano = Integer.parseInt(cmbAno.getSelectedItem().toString());

            return LocalDate.of(ano, mes, dia);
        } catch (NumberFormatException e) {
            throw new Exception("Data inválida! Verifique o dia e o mês.");
        }
    }
}