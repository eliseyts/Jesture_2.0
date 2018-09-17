package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dactyl extends JComponent {

    private BufferedImage forwardButton = null;
    private BufferedImage backwardButton = null;
    private BufferedImage backButton = null;
    private BufferedImage alphabetButton = null;
    private BufferedImage alphabet = null;
    private BufferedImage dactylJestures[] = new BufferedImage[32]; // 32 символа без ё


    Dactyl(){

    }

    //Подключение изображений
    public void setImages(){
        try
        {
            for (int i = 0; i < 32; i++) {
               dactylJestures[i]= ImageIO.read(new File("images/jestures/"+i+".png"));
            }
            forwardButton = ImageIO.read(new File("images/->.png"));
            backwardButton = ImageIO.read(new File("images/<-.png"));
            backButton = ImageIO.read(new File("images/BackButton.png"));
            alphabetButton = ImageIO.read(new File("images/aya.png"));
            alphabet = ImageIO.read(new File("images/alphabet.png"));
        } catch (IOException e){e.printStackTrace();}
    }

    //Отрисовка изображений
    public void drawImages(Graphics g){
        g.drawImage(dactylJestures[0],150, 200,300,400,null);
        g.drawImage(alphabetButton,1000, 100,100,100,null);
        g.drawImage(backButton,500, 700,200,50,null);
        g.drawImage(forwardButton,500, 700,100,100,null);
        g.drawImage(backwardButton,500, 700,100,100,null);
    }

    //Отрисовка алфавита
    public void drawAlphabet(Graphics g){
        g.drawImage(alphabet,10, 10,1200,640,null);
        g.drawImage(backButton,500, 700,200,50,null);
    }

    public void paint(Graphics g){
        setImages();
        drawImages(g);
    }
}
