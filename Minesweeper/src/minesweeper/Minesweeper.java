package minesweeper;

/**
 * Gytis Jankauskas
 * PRif-16/1
 * 20163785
 */
public class Minesweeper implements Runnable {

    MechanicsEncapsulation Mech = new MechanicsEncapsulation();
    GUI gui = new GUI();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new Minesweeper()).start();
    }

    @Override
    public void run() {
       while(true){
           gui.repaint();
           if (Mech.resetter == false){
           Mech.checkVictoryStatus();
           //System.out.println("Victory: " + gui.victory + ", Defeat: " + gui.defeat);
           }
       }
    }
    
}
