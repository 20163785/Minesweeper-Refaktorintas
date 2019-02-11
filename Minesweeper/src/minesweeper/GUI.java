/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class GUI extends JPanel {

        Variables4UIInheritanceopenclosed v = new Variables4UIInheritanceopenclosed();
        
    //spalvos langeliu, fono, minu, skaiciu ir tt
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 1280, 800);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                int spaccing = 0;
                g.setColor(Color.gray);
                if (v.revealed[i][j] == true) {
                    g.setColor(Color.white);
                    if (v.mines[i][j] == 1) {
                        g.setColor(Color.red);
                    }
                }
                if (v.mx >= v.spacing + i * 80 && v.mx < v.spacing + i * 80 + 80 - 2 * v.spacing && v.my >= spaccing + j * 80 + 80 + 26 && v.my < v.spacing + j * 80 + 80 + 80 - 2 * v.spacing) {
                    g.setColor(Color.DARK_GRAY);
                }
                g.fillRect(v.spacing + i * 80, v.spacing + j * 80 + 80, 80 - 2 * v.spacing, 80 - 2 * v.spacing);
                if (v.revealed[i][j] == true) {
                    g.setColor(Color.black);
                    if (v.mines[i][j] == 0 && v.neighbours[i][j] != 0) {
                        if (v.neighbours[i][j] == 1) {
                            g.setColor(Color.blue);
                        } else if (v.neighbours[i][j] == 2) {
                            g.setColor(Color.green);
                        } else if (v.neighbours[i][j] == 3) {
                            g.setColor(Color.red);
                        } else if (v.neighbours[i][j] == 4) {
                            g.setColor(new Color(0, 0, 128));
                        } else if (v.neighbours[i][j] == 5) {
                            g.setColor(new Color(178, 34, 34));
                        } else if (v.neighbours[i][j] == 6) {
                            g.setColor(new Color(72, 209, 204));
                        } else if (v.neighbours[i][j] == 7) {
                            g.setColor(Color.black);
                        } else if (v.neighbours[i][j] == 8) {
                            g.setColor(Color.darkGray);
                        }
                        g.setFont(new Font("Tahoma", Font.BOLD, 40));
                        g.drawString(Integer.toString(v.neighbours[i][j]), i * 80 + 27, j * 80 + 80 + 55);
                    } else if (v.mines[i][j] == 1) {
                        g.fillRect(i * 80 + 10 + 20, j * 80 + 80 + 20, 20, 40);
                        g.fillRect(i * 80 + 20, j * 80 + 80 + 10 + 20, 40, 20);
                        g.fillRect(i * 80 + 5 + 20, j * 80 + 80 + 5 + 20, 30, 30);
                        g.fillRect(i * 80 + 38, j * 80 + 80 + 15, 4, 50);
                        g.fillRect(i * 80 + 15, j * 80 + 80 + 38, 50, 4);
                    }
                }

                //flagerio paveiksliukas ant kvadrateliu
                if (v.flagged[i][j] == true) {
                    g.setColor(Color.black);
                    g.fillRect(i*80+32+5, j*80+80+15, 7, 40);
                    g.fillRect(i*80+20+5, j*80+80+50, 30, 10);
                    g.setColor(Color.red);
                    g.fillRect(i*80+16+5, j*80+80+15, 20, 15);
                    g.setColor(Color.black);
                    g.drawRect(i*80+16+5, j*80+80+15, 20, 15);
                    g.drawRect(i*80+17+5, j*80+80+16, 18, 13);
                    g.drawRect(i*80+18+5, j*80+80+17, 16, 11);
                }

            }
        }

        //smiley paveikslas
        g.setColor(Color.yellow);
        g.fillOval(v.smileyX, v.smileyY, 70, 70);
        g.setColor(Color.black);
        g.fillRect(v.smileyX + 15, v.smileyY + 20, 10, 10);
        g.fillRect(v.smileyX + 45, v.smileyY + 20, 10, 10);
        if (v.happiness == true) {
            g.fillRect(v.smileyX + 20, v.smileyY + 50, 30, 5);
            g.fillRect(v.smileyX + 15, v.smileyY + 45, 5, 5);
            g.fillRect(v.smileyX + 50, v.smileyY + 45, 5, 5);
        } else {
            g.fillRect(v.smileyX + 20, v.smileyY + 45, 30, 5);
            g.fillRect(v.smileyX + 15, v.smileyY + 50, 5, 5);
            g.fillRect(v.smileyX + 50, v.smileyY + 50, 5, 5);
        }

        //flagger paveikslas
        g.setColor(Color.lightGray);
        g.fillOval(v.flaggerX, v.flaggerY, 70, 70);
        g.setColor(Color.black);
        g.fillRect(v.flaggerX + 32, v.flaggerY + 10, 7, 40);
        g.fillRect(v.flaggerX + 20, v.flaggerY + 50, 30, 10);
        g.setColor(Color.red);
        g.fillRect(v.flaggerX + 16, v.flaggerY + 15, 20, 15);
        g.setColor(Color.black);
        g.drawRect(v.flaggerX + 16, v.flaggerY + 15, 20, 15);
        g.drawRect(v.flaggerX + 17, v.flaggerY + 16, 18, 13);
        g.drawRect(v.flaggerX + 18, v.flaggerY + 17, 16, 11);

        if (v.flagger == true) {
            g.setColor(Color.red);
        }

        g.drawOval(v.flaggerX, v.flaggerY, 70, 70);
        g.drawOval(v.flaggerX + 1, v.flaggerY + 1, 68, 68);
        g.drawOval(v.flaggerX + 2, v.flaggerY + 2, 66, 66);

        //taimeris
        g.setColor(Color.black);
        g.fillRect(v.timeX, v.timeY, 140, 70);
        if (v.defeat == false && v.victory == false) {
            v.sec = (int) ((new Date().getTime() - v.startDate.getTime()) / 1000); //dalinam is 1000 nes pateikia laika milisekundems nuo zaidimo pradzios
        }
        if (v.sec > 999) {
            v.sec = 999;
        }
        g.setColor(Color.WHITE);
        if (v.victory == true) {
            g.setColor(Color.green);
        } else if (v.defeat == true) {
            g.setColor(Color.red);
        }
        g.setFont(new Font("Tahoma", Font.PLAIN, 80));
        if (v.sec < 10) {
            g.drawString("00" + Integer.toString(v.sec), v.timeX, v.timeY + 65);
        } else if (v.sec < 100) {
            g.drawString("0" + Integer.toString(v.sec), v.timeX, v.timeY + 65);
        } else {
            g.drawString(Integer.toString(v.sec), v.timeX, v.timeY + 65);
        }

        //pergales paveiksliukas
        if (v.victory == true) {
            g.setColor(Color.green);
            v.vicMes = "PERGALĖ!";
        } else if (v.defeat == true) {
            g.setColor(Color.red);
            v.vicMes = "PRALAIMĖJAI";
        }

        if (v.victory == true || v.defeat == true) {//ciuozimas ir sustojimas uzraso
            v.vicMesY = -50 + (int) (new Date().getTime() - v.endDate.getTime()) / 10;
            if (v.vicMesY > 67) {
                v.vicMesY = 67;
            }
            g.setFont(new Font("Tahoma", Font.PLAIN, 70));
            g.drawString(v.vicMes, v.vicMesX, v.vicMesY);
        }

    }
        //gui konfiguracija
    public GUI() {
        /* this.setTitle("Minesweeper");
        this.setSize(1286, 829);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false); */

        //bombu ir kaimynu aprasymas
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                if (v.rand.nextInt(100) < 20) {
                    v.mines[i][j] = 1;
                } else {
                    v.mines[i][j] = 0;
                }
                v.revealed[i][j] = false;
            }
        }

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                v.neighs = 0;
                for (int m = 0; m < 16; m++) {
                    for (int n = 0; n < 9; n++) {
                        if (!(m == i && n == j)) {
                            if (v.isN(i, j, m, n) == true) {
                                v.neighs++;
                            }
                        }
                    }
                }
                v.neighbours[i][j] = v.neighs;
            }
        }
    }
}
