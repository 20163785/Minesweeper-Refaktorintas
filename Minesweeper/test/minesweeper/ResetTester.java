/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gytis
 */
public class ResetTester {
    public void ResetTester() {
        ResetEncapsulationsingleresponsibility r = new ResetEncapsulationsingleresponsibility();
        
        r.defeat = true;
        r.happiness = false;
        r.flagger = true;
        r.victory = true;
        
        r.resetAll();
        
        assertTrue(!r.defeat && r.happiness && !r.flagger && !r.victory);
        
    }



}
