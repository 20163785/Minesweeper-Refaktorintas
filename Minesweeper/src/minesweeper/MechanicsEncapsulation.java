package minesweeper;

//importai funkciju ir pelytes
import java.util.*;

//jframe yra programos startavimo tipas
public class MechanicsEncapsulation extends Variables4UIInheritanceopenclosed {
    
    public void checkVictoryStatus() {

        if (defeat == false) {
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 9; j++) {
                    if (revealed[i][j] == true && mines[i][j] == 1) {
                        defeat = true;
                        happiness = false;
                        endDate = new Date();
                    }
                }
            }
        }
        if (totalBoxesRevealed() >= 144 - totalMines() && victory == false) {
            victory = true;
            endDate = new Date();
        }
    }

    // tikrina visu minu skaiciu ir grazina rezultata
    public int totalMines() {
        int total = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                if (mines[i][j] == 1) {
                    total++;
                }
            }
        }
        return total;
    }

    //skaiciuoja atskleistas dezutes
    public int totalBoxesRevealed() {
        int total = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                if (revealed[i][j] == true) {
                    total++;
                }
            }
        }
        return total;
    }
}
