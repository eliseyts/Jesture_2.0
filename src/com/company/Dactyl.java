package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dactyl extends JComponent {

    private BufferedImage jesture1 = null;
    private BufferedImage backButton = null;
    private BufferedImage alphabetButton = null;
    private BufferedImage alphabet = null;

    Dactyl(){}

    //Подключение изображений
    public void setImages(){
        try
        {
            jesture1 = ImageIO.read(new File("images/jestures/А.png"));
            backButton = ImageIO.read(new File("images/BackButton.png"));
            alphabetButton = ImageIO.read(new File("images/aya.png"));
            alphabet = ImageIO.read(new File("images/alphabet.png"));
        } catch (IOException e){e.printStackTrace();}
    }

    //Отрисовка изображений
    public void drawImages(Graphics g){
        g.drawImage(jesture1,150, 200,300,400,null);
        g.drawImage(backButton,500, 700,200,50,null);
        g.drawImage(alphabetButton,1000, 100,100,100,null);
    }

    public void drawAlphabet(Graphics g){
        g.drawImage(alphabet,10, 10,1200,640,null);
        g.drawImage(backButton,500, 700,200,50,null);
    }

    public void paint(Graphics g){
        setImages();
        drawImages(g);
    }
}
