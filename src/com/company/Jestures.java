package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Jestures {
    private BufferedImage backButton = null;

    Jestures(){}

    public void setImages(){
        try
        {
            backButton = ImageIO.read(new File("images/BackButton.png"));
        } catch (IOException e){e.printStackTrace();}
    }

    //Отрисовка изображений
    public void drawImages(Graphics g){
        g.drawImage(backButton,500, 650,200,50,null);
    }

    public void paint(Graphics g){
        setImages();
        drawImages(g);
    }
}
