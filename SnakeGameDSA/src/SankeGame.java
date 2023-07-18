import javax.swing.*;

public class SankeGame extends JFrame {
    Board board;
    SankeGame(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);



    }
    public static void main(String[] args) {
   // Initialize Sanke Game
        SankeGame sankeGame = new SankeGame();

    }
}