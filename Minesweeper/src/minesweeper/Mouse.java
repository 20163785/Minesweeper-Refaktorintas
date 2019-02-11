/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Mouse extends Variables4UIInheritanceopenclosed implements MouseMotionListener {
    
        InsidePolimorphism in = new InsidePolimorphism();
        ResetEncapsulationsingleresponsibility reset = new ResetEncapsulationsingleresponsibility();
        
        public Mouse() {
        }
    
        
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            mx = e.getX();
            my = e.getY();
            /*
            System.out.println("The mouse was moved!");
            System.out.println("X: " + mx + ", Y: " +my);
             */
        }
    public void mouseClicked(MouseEvent e) {

        mx = e.getX();//kad neglicintu smailikas, kai greitai nori paresetint zaidima
        my = e.getY();

        if (in.BoxX() != -1 && in.BoxY() != -1) {
            System.out.println("The mouse is in the [" + in.BoxX() + ", " + in.BoxY() + "], Number of neighs: " + neighbours[in.BoxX()][in.BoxY()]);
            if (flagger == true && revealed[in.BoxX()][in.BoxY()] == false) {
                flagged[in.BoxX()][in.BoxY()] = flagged[in.BoxX()][in.BoxY()] == false;
            } else {
                if (flagged[in.BoxX()][in.BoxY()] == false){
                revealed[in.BoxX()][in.BoxY()] = true;
                }
            }
        } else {
            System.out.println("The pointer is not inside of any box!");
        }

        if (in.Smiley() == true) {
            System.out.println("The pointer is inside the smiley!");
        } else {
            System.out.println("The pointer is not inside the smiley!");
        }

        if (in.Smiley() == true) {
            reset.resetAll();
        }

        if (in.Flagger() == true) {
            if (flagger == false) {
                flagger = true;
                System.out.println("In flagger = true!");
            } else {
                flagger = false;
                System.out.println("In flagger = flase!");
            }
        }

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

}
