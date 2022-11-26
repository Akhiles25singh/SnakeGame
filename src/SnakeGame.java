import javax.swing.*;

public class SnakeGame {
    JFrame frame;
    SnakeGame(){
        frame = new JFrame();
        Board board = new Board();

        frame.add(board);
        frame.setResizable(false);
        frame.pack();


        frame.setVisible(true);
        frame.setBounds(100,100,400,400);

    }
    public static void main (String[] args){
        SnakeGame snakeGame = new SnakeGame();
    }
}