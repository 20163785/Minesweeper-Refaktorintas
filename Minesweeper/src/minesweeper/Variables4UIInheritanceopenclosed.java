/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

public class Variables4UIInheritanceopenclosed extends Variables {
    public int mx = -100;//koordinates
    public int my = -100;

    public int smileyX = 605;//smailo vieta
    public int smileyY = 5;

    public int smileyCenterX = smileyX + 35; //smailo centras
    public int smileyCenterY = smileyY + 35;

    public int flaggerX = 445; //veliavos vieta
    public int flaggerY = 5;

    public int flaggerCenterX = flaggerX + 35; //veliavos centras
    public int flaggerCenterY = flaggerY + 35;

    public int timeX = 1130;//laikmacio vieta
    public int timeY = 5;

    public int vicMesX = 700;//uzraso vieta
    public int vicMesY = -50;
    
    public boolean isN(int mX, int mY, int cX, int cY) {
        return mX - cX < 2 && mX - cX > - 2 && mY - cY < 2 && mY - cY > - 2 && mines[cX][cY] == 1;
    }
}
