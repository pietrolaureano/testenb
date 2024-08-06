
package applicationconfirmdialog;

import javax.swing.JOptionPane;

public class ApplicationConfirmDialog {

    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null, 
                "Deseja excluir arquivo?", 
                "Excluir", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
    System.out.printf("agradeço ");        
    }

}
