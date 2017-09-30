package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double MAX_BILL = 100.00;
    
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
   
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double calcTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    public final double getMAX_BILL() {
        return MAX_BILL;
    }

    public final void setMAX_BILL(double MAX_BILL) {
        if(MAX_BILL <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        BaggageServiceTipCalculator.MAX_BILL = MAX_BILL;
    }

    public final double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public final void setGOOD_RATE(double GOOD_RATE) {
        if(GOOD_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        BaggageServiceTipCalculator.GOOD_RATE = GOOD_RATE;
    }

    public final double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public final void setFAIR_RATE(double FAIR_RATE) {
        if(FAIR_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        BaggageServiceTipCalculator.FAIR_RATE = FAIR_RATE;
    }

    public final double getPOOR_RATE() {
        return POOR_RATE;
    }

    public final void setPOOR_RATE(double POOR_RATE) {
        if(POOR_RATE <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        BaggageServiceTipCalculator.POOR_RATE = POOR_RATE;
    }
    
    

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
