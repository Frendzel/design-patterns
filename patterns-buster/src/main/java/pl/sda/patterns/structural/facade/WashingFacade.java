package pl.sda.patterns.structural.facade;

//TODO implement all steps necessary to do the laundry
public class WashingFacade {

    private DryingRack dryingRack = new DryingRack();
    private LaundryBasket laundryBasket = new LaundryBasket();
    private WashingMachine washingMachine = new WashingMachine();


    public void start() {
        WashingParams.WashingParamsBuilder builder = WashingParams.builder();
        this.start(builder.build());
    }

    public void start(WashingParams params) {
        laundryBasket.emptyOut();
        washingMachine.setTemperature(params.getDegrees());
        washingMachine.loadLaundry();
        washingMachine.chooseProgram();
        washingMachine.start();

    }

    public void stop() {
        washingMachine.stop();
//        dryingRack.removeOldLaundry();
        dryingRack.hangLaundry();
    }
}
