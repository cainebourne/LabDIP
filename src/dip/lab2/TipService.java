/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Cainebourne
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        setCalc(calc);
        
    }
    
    public final double calcTip(){
        return calc.calcTip();
    }

    public final TipCalculator getCalc() {
        return calc;
    }

    public final void setCalc(TipCalculator calc) {
        if(calc == null){
            throw new IllegalArgumentException("No tip calculator provided");
        }
        this.calc = calc;
    }
    
    
}

