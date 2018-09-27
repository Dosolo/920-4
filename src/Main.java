import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    static int x=1;
    static int y;
    static JButton oneButton = new JButton();
    static JButton twoButton = new JButton();
    static JButton threeButton = new JButton();
    static JButton fourButton = new JButton();
    static JButton fiveButton = new JButton();
    static JButton sixButton = new JButton();
    static JButton sevenButton = new JButton();
    static JButton eightButton = new JButton();
    static JButton nineButton = new JButton();
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello world");
        frame.setSize(440, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
        JLabel label = new JLabel("");
        JButton button =new JButton();
    }
    private static void placeComponents(JPanel panel){
        panel.setLayout(null);
        oneButton.setBounds(50,50,100,100);
        panel.add(oneButton);
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton oneButton =(JButton) actionEvent.getSource();
                if (x%2==1){
                    oneButton.setText("O");
                }else if (x%2==0){
                    oneButton.setText("X");
                }
                x++;
                oneButton.setEnabled(false);
                if (oneButton.getText().equals(twoButton.getText())&&oneButton.getText().equals(threeButton.getText())
                        ||oneButton.getText().equals(fourButton.getText())&&oneButton.getText().equals(sevenButton.getText())
                        ||oneButton.getText().equals(fiveButton.getText())&&oneButton.getText().equals(nineButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        twoButton.setBounds(160,50,100,100);
        panel.add(twoButton);
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    twoButton.setText("O");
                }else if (x%2==0){
                    twoButton.setText("X");
                }
                x++;
                twoButton.setEnabled(false);
                if (twoButton.getText().equals(oneButton.getText())&&twoButton.getText().equals(threeButton.getText())
                        ||twoButton.getText().equals(fiveButton.getText())&&twoButton.getText().equals(eightButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        threeButton.setBounds(270,50,100,100);
        panel.add(threeButton);
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    threeButton.setText("O");
                }else if (x%2==0){
                    threeButton.setText("X");
                }
                x++;
                threeButton.setEnabled(false);
                if (threeButton.getText().equals(sixButton.getText())&&threeButton.getText().equals(nineButton.getText())
                        ||threeButton.getText().equals(fiveButton.getText())&&threeButton.getText().equals(eightButton.getText())
                        ||threeButton.getText().equals(oneButton.getText())&&threeButton.getText().equals(twoButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        fourButton.setBounds(50,160,100,100);
        panel.add(fourButton);
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    fourButton.setText("O");
                }else if (x%2==0){
                    fourButton.setText("X");
                }
                x++;
                fourButton.setEnabled(false);
                if (fourButton.getText().equals(oneButton.getText())&&fourButton.getText().equals(sevenButton.getText())
                        ||fourButton.getText().equals(fiveButton.getText())&&fourButton.getText().equals(sixButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        fiveButton.setBounds(160,160,100,100);
        panel.add(fiveButton);
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    fiveButton.setText("O");
                }else if (x%2==0){
                    fiveButton.setText("X");
                }
                x++;
                fiveButton.setEnabled(false);
                if (fiveButton.getText().equals(oneButton.getText())&&fiveButton.getText().equals(nineButton.getText())
                        ||fiveButton.getText().equals(threeButton.getText())&&fiveButton.getText().equals(sevenButton.getText())
                        ||fiveButton.getText().equals(twoButton.getText())&&fiveButton.getText().equals(eightButton.getText())
                        ||fiveButton.getText().equals(fourButton.getText())&&fiveButton.getText().equals(sixButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        sixButton.setBounds(270,160,100,100);
        panel.add(sixButton);
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    sixButton.setText("O");
                }else if (x%2==0){
                    sixButton.setText("X");
                }
                x++;
                sixButton.setEnabled(false);
                if (sixButton.getText().equals(fourButton.getText())&&sixButton.getText().equals(fiveButton.getText())
                        ||sixButton.getText().equals(threeButton.getText())&&sixButton.getText().equals(nineButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        sevenButton.setBounds(50,270,100,100);
        panel.add(sevenButton);
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    sevenButton.setText("O");
                }else if (x%2==0){
                    sevenButton.setText("X");
                }
                x++;
                sevenButton.setEnabled(false);
                if (sevenButton.getText().equals(oneButton.getText())&&sevenButton.getText().equals(fourButton.getText())
                        ||sevenButton.getText().equals(eightButton.getText())&&sevenButton.getText().equals(nineButton.getText())
                        ||sevenButton.getText().equals(threeButton.getText())&&sevenButton.getText().equals(fiveButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        eightButton.setBounds(160,270,100,100);
        panel.add(eightButton);
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    eightButton.setText("O");
                }else if (x%2==0){
                    eightButton.setText("X");
                }
                x++;
                eightButton.setEnabled(false);
                if (eightButton.getText().equals(twoButton.getText())&&eightButton.getText().equals(fiveButton.getText())
                        ||eightButton.getText().equals(sevenButton.getText())&&eightButton.getText().equals(nineButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });
        nineButton.setBounds(270,270,100,100);
        panel.add(nineButton);
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (x%2==1){
                    nineButton.setText("O");
                }else if (x%2==0){
                    nineButton.setText("X");
                }
                x++;
                nineButton.setEnabled(false);
                if (nineButton.getText().equals(threeButton.getText())&&nineButton.getText().equals(sixButton.getText())
                        ||nineButton.getText().equals(sevenButton.getText())&&nineButton.getText().equals(eightButton.getText())
                        ||nineButton.getText().equals(oneButton.getText())&&nineButton.getText().equals(fiveButton.getText())) {
                    if(x%2==1) {
                        JOptionPane.showMessageDialog(null, "win:X , lose:O", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(null, "win:O , lose:X", "結束", JOptionPane.INFORMATION_MESSAGE );
                    }
                }
            }
        });

    }
}