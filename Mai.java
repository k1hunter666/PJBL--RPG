import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      SwingUtilities.invokeLater(() -> {
         JFrame var0 = new JFrame("Jogo de Coleta de Moedas");
         var0.setDefaultCloseOperation(3);
         var0.getContentPane().add(new PainelJogo());
         var0.pack();
         var0.setLocationRelativeTo((Component)null);
         var0.setVisible(true);
      });
   }
}
//  inicializa a interface gráfica de um jogo