package Lession1;

import javax.swing.*;

public class HelloWorld {
    public static void firstProgram()
    {
        JFrame jFrame = new JFrame("First Programming with Java");
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        firstProgram();
    }
}
