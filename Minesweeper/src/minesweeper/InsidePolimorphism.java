/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

public class InsidePolimorphism extends Variables4UIInheritanceopenclosed {
    //dezuciu koordinaciu aprasymas

    public int BoxX() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                int spaccing = 0;
                if (mx >= spacing + i * 80 && mx < spacing + i * 80 + 80 - 2 * spacing && my >= spaccing + j * 80 + 80 + 26 && my < spacing + j * 80 + 80 + 80 - 2 * spacing) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int BoxY() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                int spaccing = 0;
                if (mx >= spacing + i * 80 && mx < spacing + i * 80 + 80 - 2 * spacing && my >= spaccing + j * 80 + 80 + 26 && my < spacing + j * 80 + 80 + 80 - 2 * spacing) {
                    return j;
                }
            }
        }
        return -1;
    }

    //aprasoma, kad zaidimo restartavimo mygtukas bus smailikas 
    public boolean Smiley() {
        return dif(mx, my, smileyCenterX, smileyCenterY) < 35;
    }

    public boolean Flagger() {
        return dif(mx, my, flaggerCenterX, flaggerCenterY) < 35;
    }

    public int dif(int x0, int y0, int x, int y) {
        return (int) Math.sqrt(Math.abs(x0 - x) * Math.abs(x0 - x) + Math.abs(y0 - y) * Math.abs(y0 - y));
    }
}
