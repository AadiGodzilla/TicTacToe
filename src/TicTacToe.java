import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class TicTacToe extends JFrame {

    ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("icon/tic-tac-toe.png")));

    public Title title = new Title("Tic-Tac-Toe");
    public Grid grid = new Grid(this);
    public Reset reset = new Reset(this);
    public WinChecker winChecker = new WinChecker(this);

    public TicTacToe() {

        initComponents();

    }

    public void initComponents() {
        this.setIconImage(icon.getImage());
        this.setTitle("Tic-Tac-Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(400, 450);
        this.setResizable(false);

        this.add(title, BorderLayout.NORTH);
        this.add(grid);
        this.add(reset, BorderLayout.SOUTH);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
