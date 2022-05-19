package ru.geekbrains.postupaylo.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationWindow extends JFrame {
    private static Font font = new Font("Arial", Font.BOLD, 26);
    private static JLabel counterValueView = new JLabel();

    public ApplicationWindow(int initialValue) {
        Cat[] cats = {
                new Cat("Barsik", 30) ,
                new Cat("Murzik", 5) ,
                new Cat("Piatno", 15) ,
                new Cat("Tom", 3) ,
                new Cat("Fix", 19) ,
                new Cat("Larry", 20) ,
                new Cat("Oruel", 23) ,
                new Cat("Antony", 19) ,
                new Cat("Andrew", 23) ,
                new Cat("Tomas", 25),
                new Cat("Julya", 5)
        };
        Plate plate = new Plate(150);

        setBounds(100, 200, 800, 500);
        setTitle("Cat feeder");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.NORTH);

        counterValueView.setText(String.format("Food in plate %d", plate.gerRestOfFood()));
        addCats(cats, plate);

        setVisible(true);
    }

    private void addCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            JButton catFeedButton = new JButton(String.format("Feed %s", cat.getName()));
            catFeedButton.setFont(font);
            add(catFeedButton, BorderLayout.SOUTH);

            catFeedButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        cat.eat(plate);
                        counterValueView.setText(String.format("Food in plate %d", plate.gerRestOfFood()));
                    } catch (NotEnoughFoodException ex) {
                        showAlert(ex.getMessage());
                    }
                }
            });
        }
    }

    private void showAlert(String alertMessage){
        JOptionPane.showMessageDialog(this, alertMessage);
    }

    public static void main(String[] args) {
        new ApplicationWindow(0);
    }
}
