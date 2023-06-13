import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset extends JButton implements ActionListener {

    TicTacToe ticTacToe;

    public Reset (TicTacToe ticTacToe) {
        this.ticTacToe = ticTacToe;

        this.setText("Reset");
        this.setLayout(new BorderLayout());
        this.setBounds(0,0,400,50);
        this.setFocusable(false);
        this.addActionListener(this);
        this.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {

            for (int i = 0; i < ticTacToe.grid.buttons.length; i++) {

                ticTacToe.grid.buttons[i].setEnabled(true);
                ticTacToe.grid.buttons[i].setText("");
                ticTacToe.grid.buttons[i].setBackground(null);
            }

            if (ticTacToe.winChecker.Draw) {

                ticTacToe.grid.initPlayerTurn();

            }

            ticTacToe.winChecker.notDraw = true;
            ticTacToe.winChecker.Draw = false;

            if (ticTacToe.grid.playerTurn == 1) {
                ticTacToe.title.titleLabel.setText("O Turn");
            }
            if (ticTacToe.grid.playerTurn == 2) {
                ticTacToe.title.titleLabel.setText("X Turn");
            }

            this.setEnabled(false);

        }
     }
}
