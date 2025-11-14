public class Phone {
	private final String model;
	private final double screenSize;
	private final int batteryCapacity;
	
	public Phone(String model, double screenSize, int batteryCapacity) {
		// TODO: ensure the screenSize and batteryCapacity are positive
		// by throwing an IllegalArgumentException otherwise
        // TODO 1 answer
        if (screenSize <= 0 || batteryCapacity <= 0) {
            throw new IllegalArgumentException("Screen size and battery capacity must be positive");
        }


        this.model = model;
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;
	}
	
	/*
	 * Gets the phone's model name.
	 */
	public String getModel() {
		return model; 
	}
	
	/*
	 * Gets the phone's diagonal screen size (in inches).
	 */
	public double getScreenSize() {
		return screenSize;
	}
	
	/*
	 * Gets the phone's battery capacity (in mAh).
	 */
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	/*
	 * Determines whether this phone "dominates" another phone, meaning
	 * this phone is better in one criterion, and at least as good in the
	 * other criterion.
	 */
	public boolean dominates(Phone other) {

        // TODO 2 answer
        boolean betterScreen = this.screenSize > other.screenSize;
        boolean betterBattery = this.batteryCapacity > other.batteryCapacity;
        boolean sameOrBetterScreen = this.screenSize >= other.screenSize;
        boolean sameOrBetterBattery = this.batteryCapacity >= other.batteryCapacity;

        return (betterScreen && sameOrBetterBattery) || (betterBattery && sameOrBetterScreen);
	}
}
