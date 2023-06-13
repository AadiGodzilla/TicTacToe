import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JPanel implements ActionListener {

    TicTacToe ticTacToe;

    public JButton[] buttons = new JButton[9];

    int playerTurn;

    public Grid(TicTacToe ticTacToe) {

        this.ticTacToe = ticTacToe;

        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 40));
            buttons[i].addActionListener(this);
            this.add(buttons[i]);
        }

        initPlayerTurn();
    }

    public void initPlayerTurn() {
        playerTurn = (int) (Math.floor(Math.random() * 2) + 1);

        if (playerTurn == 1) {
            ticTacToe.title.titleLabel.setText("O Turn");
        }
        if (playerTurn == 2) {
            ticTacToe.title.titleLabel.setText("X Turn");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {

                if (playerTurn == 1 && buttons[i].getText().equals("")) {
                    ticTacToe.title.titleLabel.setText("X turn");
                    buttons[i].setText("O");
                    playerTurn = 2;
                    ticTacToe.winChecker.check();

                }
                else if (playerTurn == 2 && buttons[i].getText().equals("")) {
                    ticTacToe.title.titleLabel.setText("O turn");
                    buttons[i].setText("X");
                    playerTurn = 1;
                    ticTacToe.winChecker.check();
                }
            }
        }
    }
}
