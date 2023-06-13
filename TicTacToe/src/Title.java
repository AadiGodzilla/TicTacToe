import javax.swing.*;
import java.awt.*;

public class Title extends JPanel {

    public JLabel titleLabel = new JLabel();

    public Title (String title) {
        this.setLayout(new BorderLayout());
        this.setBounds(0,0,400, 0);
        this.setBackground(Color.black);

        titleLabel.setText(title);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBackground(Color.black);
        titleLabel.setForeground(Color.GREEN);
        titleLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        this.add(titleLabel);
    }

}
