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

    Dactyl(){}

    public void setImages(){
        try
        {
            jesture1 = ImageIO.read(new File("images/jestures/А.png"));
            backButton = ImageIO.read(new File("images/BackButton.png"));
        } catch (IOException e){e.printStackTrace();}
    }

    //Отрисовка изображений
    public void drawImages(Graphics g){
        g.drawImage(jesture1,150, 300,300,400,null);
        g.drawImage(backButton,500, 650,200,50,null);
    }

    public void paint(Graphics g){
        setImages();
        drawImages(g);
    }
}
