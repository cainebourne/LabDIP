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
    
    private static double MAX_BILL = 100.00;
    
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

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
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
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

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        if(goodRate <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        if(fairRate <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
          if(poorRate <= 0){
            throw new IllegalArgumentException("Not A valid tip amount");
        }
        this.poorRate = poorRate;
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
