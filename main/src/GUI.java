import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hello World");
        JOptionPane.showMessageDialog(null,"Hello "+ name);
        int chess = Integer.parseInt(JOptionPane.showInputDialog("how many chess pieces out there?"));
        JOptionPane.showMessageDialog(null, "8  "+ chess);
    }
}