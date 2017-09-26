package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;

    private double bill;
   
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public double calcTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public final static void setGOOD_RATE(double GOOD_RATE) {
        if(GOOD_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        FoodServiceTipCalculator.GOOD_RATE = GOOD_RATE;
    }

    public final static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public final static void setFAIR_RATE(double FAIR_RATE) {
        if(FAIR_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        FoodServiceTipCalculator.FAIR_RATE = FAIR_RATE;
    }

    public final static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public final static void setPOOR_RATE(double POOR_RATE) {
         if(POOR_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        FoodServiceTipCalculator.POOR_RATE = POOR_RATE;
    }
    
    
            

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException("bill entry error");
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
