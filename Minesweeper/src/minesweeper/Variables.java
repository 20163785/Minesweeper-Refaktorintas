/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Date;
import java.util.Random;

public class Variables {
    public boolean resetter = false;//restartas

    public boolean flagger = false;//veliava

    Date startDate = new Date();//laikas
    Date endDate;

    int spacing = 5;

    int neighs = 0;

    String vicMes = "Nothing yet!";

    public int sec = 0;

    public boolean happiness = true;

    public boolean victory = false;

    public boolean defeat = false;

    Random rand = new Random();

    int[][] mines = new int[16][9]; //minos
    int[][] neighbours = new int[16][9];//kaimyna
    boolean[][] revealed = new boolean[16][9];//tusti langeliai
    boolean[][] flagged = new boolean[16][9];//veliavos
}
