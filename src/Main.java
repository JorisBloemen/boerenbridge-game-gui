import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String arg[])
    {
        // create the frame
        JFrame window = new JFrame("Boeren Bridge");

        // set close action
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // add background
        JPanel panel1 = new JPanel(),
                panel2 = new JPanel(),
                panel3 = new JPanel(),
                panel4 = new JPanel();

        panel1.setBackground(Color.red);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
        JTextField ronde = new JTextField("Ronde 1");
        panel1.add(ronde);
        JLabel x = new JLabel("Ronde 1");
        panel1.add(x);
        String columnNames[] = {"Naam", "Score"};
        String data[][] = {
                {"Cpu 1", "10"},
                {"Cpu 2", "20"},
                {"Cpu 3", "0"},
                {"Cpu 4", "-40"},
                {"Speler", "35"},
        };
        JTable totaalScore = new JTable(data, columnNames);
        panel1.add(totaalScore);

        panel2.setBackground(Color.green);

        panel3.setBackground(Color.blue);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
        JTextField slag = new JTextField("Slag 3");
        panel3.add(ronde);
        String columnNames2[] = {"Naam", "Bod", "Gewonnen"};
        String data2[][] = {
                {"Cpu 1", "2", "2"},
                {"Cpu 2", "1", "0"},
                {"Cpu 3", "0", "0"},
                {"Cpu 4", "0", "1"},
                {"Speler", "2", "3"},
        };
        JTable slagScore = new JTable(data, columnNames);
        panel3.add(slagScore);

        panel4.setBackground(Color.orange);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.LINE_AXIS));
        for (int i = 0; i < 10; i++)
        {
            JButton b = new JButton("Kaart " + i);
            panel4.add(b);
        }

        window.getContentPane().add(panel1, BorderLayout.LINE_START);
        window.getContentPane().add(panel2, BorderLayout.CENTER);
        window.getContentPane().add(panel3, BorderLayout.LINE_END);
        window.getContentPane().add(panel4, BorderLayout.PAGE_END);

//        // add overlay
//        JPanel overlay = new JPanel();
//        overlay.setBackground(new Color(0, 0, 0, 0));
//        background.add(overlay, BorderLayout.LINE_START);

//        // add image
//        try {
//            BufferedImage skull_image = ImageIO.read(new File("C:\\Users\\Johan\\Pictures\\Avatar\\skull.gif"));
//            JLabel skull = new JLabel(new ImageIcon(skull_image));
//            background.add(skull);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // add components
        window.pack();
        window.setVisible(true);
    }
}
