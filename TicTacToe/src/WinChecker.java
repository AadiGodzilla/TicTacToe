import javax.swing.*;
import java.awt.*;

public class WinChecker {

    TicTacToe ticTacToe;
    boolean notDraw, Draw;

    public WinChecker(TicTacToe ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public void check() {
        if (
                ticTacToe.grid.buttons[0].getText().equals("O") &&
                ticTacToe.grid.buttons[1].getText().equals("O") &&
                ticTacToe.grid.buttons[2].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 0,1,2);
        }
        if (
                ticTacToe.grid.buttons[3].getText().equals("O") &&
                ticTacToe.grid.buttons[4].getText().equals("O") &&
                ticTacToe.grid.buttons[5].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 3,4,5);
        }
        if (
                ticTacToe.grid.buttons[6].getText().equals("O") &&
                ticTacToe.grid.buttons[7].getText().equals("O") &&
                ticTacToe.grid.buttons[8].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 6,7,8);
        }

        if (
                ticTacToe.grid.buttons[0].getText().equals("O") &&
                ticTacToe.grid.buttons[3].getText().equals("O") &&
                ticTacToe.grid.buttons[6].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 0,3,6);
        }
        if (
                ticTacToe.grid.buttons[1].getText().equals("O") &&
                ticTacToe.grid.buttons[4].getText().equals("O") &&
                ticTacToe.grid.buttons[7].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 1,4,7);
        }
        if (
                ticTacToe.grid.buttons[2].getText().equals("O") &&
                ticTacToe.grid.buttons[5].getText().equals("O") &&
                ticTacToe.grid.buttons[8].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 2,5,8);
        }

        if (
                ticTacToe.grid.buttons[0].getText().equals("O") &&
                ticTacToe.grid.buttons[4].getText().equals("O") &&
                ticTacToe.grid.buttons[8].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 0,4,8);
        }
        if (
                ticTacToe.grid.buttons[2].getText().equals("O") &&
                ticTacToe.grid.buttons[4].getText().equals("O") &&
                ticTacToe.grid.buttons[6].getText().equals("O")
        ) {
            notDraw = true;
            Win("O Wins",1, 2,4,6);
        }





        if (
                ticTacToe.grid.buttons[0].getText().equals("X") &&
                ticTacToe.grid.buttons[1].getText().equals("X") &&
                ticTacToe.grid.buttons[2].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 0,1,2);
        }
        if (
                ticTacToe.grid.buttons[3].getText().equals("X") &&
                ticTacToe.grid.buttons[4].getText().equals("X") &&
                ticTacToe.grid.buttons[5].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 3,4,5);
        }
        if (
                ticTacToe.grid.buttons[6].getText().equals("X") &&
                ticTacToe.grid.buttons[7].getText().equals("X") &&
                ticTacToe.grid.buttons[8].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 6,7,8);
        }

        if (
                ticTacToe.grid.buttons[0].getText().equals("X") &&
                ticTacToe.grid.buttons[3].getText().equals("X") &&
                ticTacToe.grid.buttons[6].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 0,3,6);
        }
        if (
                ticTacToe.grid.buttons[1].getText().equals("X") &&
                ticTacToe.grid.buttons[4].getText().equals("X") &&
                ticTacToe.grid.buttons[7].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 1,4,7);
        }
        if (
                ticTacToe.grid.buttons[2].getText().equals("X") &&
                ticTacToe.grid.buttons[5].getText().equals("X") &&
                ticTacToe.grid.buttons[8].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 2,5,8);
        }

        if (
                ticTacToe.grid.buttons[0].getText().equals("X") &&
                ticTacToe.grid.buttons[4].getText().equals("X") &&
                ticTacToe.grid.buttons[8].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 0,4,8);
        }
        if (
                ticTacToe.grid.buttons[2].getText().equals("X") &&
                ticTacToe.grid.buttons[4].getText().equals("X") &&
                ticTacToe.grid.buttons[6].getText().equals("X")
        ) {
            notDraw = true;
            Win("X Wins",2, 2,4,6);
        }

        if (
                !ticTacToe.grid.buttons[0].getText().equals("") &&
                !ticTacToe.grid.buttons[1].getText().equals("") &&
                !ticTacToe.grid.buttons[2].getText().equals("") &&
                !ticTacToe.grid.buttons[3].getText().equals("") &&
                !ticTacToe.grid.buttons[4].getText().equals("") &&
                !ticTacToe.grid.buttons[5].getText().equals("") &&
                !ticTacToe.grid.buttons[6].getText().equals("") &&
                !ticTacToe.grid.buttons[7].getText().equals("") &&
                !ticTacToe.grid.buttons[8].getText().equals("") &&
                !notDraw
        ){
            Draw = true;
            for (int i = 0; i < ticTacToe.grid.buttons.length; i++) {

                ticTacToe.grid.buttons[i].setEnabled(false);
                ticTacToe.title.titleLabel.setText("DRAW");

                ticTacToe.reset.setEnabled(true);
            }
        }
    }

    public void Win(String winner, int playerTurn, int button1, int button2, int button3) {

        ticTacToe.grid.buttons[button1].setBackground(Color.GREEN);
        ticTacToe.grid.buttons[button2].setBackground(Color.GREEN);
        ticTacToe.grid.buttons[button3].setBackground(Color.GREEN);

        ticTacToe.title.titleLabel.setText(winner);
        ticTacToe.grid.playerTurn = playerTurn;

        for (int i = 0; i < ticTacToe.grid.buttons.length; i++) {
            ticTacToe.grid.buttons[i].setEnabled(false);
        }

        ticTacToe.reset.setEnabled(true);
    }

}
