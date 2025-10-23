package Lab4;

public class Tamagotchi {
    // Private fields
    private int hungriness;
    private int happiness;
    private int cleanness;
    private int tiredness;

    // Constructor - sets a sensible starting state
    public Tamagotchi() {
        this.hungriness = 5;
        this.happiness = 5;
        this.cleanness = 5;
        this.tiredness = 5;
    }

    // Getters
    public int getHungriness() {
        return hungriness;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getCleanness() {
        return cleanness;
    }

    public int getTiredness() {
        return tiredness;
    }

    // Feed the Tamagotchi
    public void feed() {
        hungriness -= 5;
        if (hungriness < 0) {
            hungriness = 0;
        }
        System.out.println("You fed your Tamagotchi.");
    }

    // Take it for a walk
    public void walk() {
        happiness += 3;
        tiredness += 2;
        limitValues();
        System.out.println("You took your Tamagotchi for a walk.");
    }

    // Clean the Tamagotchi
    public void clean() {
        cleanness += 10;
        if (cleanness > 10) {
            cleanness = 10;
        }
        System.out.println("You cleaned your Tamagotchi.");
    }

    // Pet the Tamagotchi
    public void pet() {
        happiness += 5;
        if (happiness > 10) {
            happiness = 10;
        }
        System.out.println("You petted your Tamagotchi.");
    }

    // Get current mood
    public String getMood() {
        if (tiredness == 10) {
            return "asleep";
        } else if (tiredness >= 8) {
            return "tired";
        } else if (hungriness >= 7) {
            return "hungry";
        } else if (cleanness < 3) {
            return "dirty";
        } else if (happiness >= 8) {
            return "happy";
        } else if (happiness >= 4) {
            return "ok";
        } else {
            return "sad";
        }
    }

    // Pass time
    public void passTime() {
        hungriness += 1;
        cleanness -= 1;

        if (tiredness == 10) {
            tiredness = 0; // wakes up refreshed
        } else {
            tiredness += 1;
        }

        if (hungriness >= 7) {
            happiness -= 1;
        }
        if (cleanness < 3) {
            happiness -= 1;
        }

        limitValues();
        System.out.println("Time has passed...");
    }

    // Keep all values between 0 and 10
    private void limitValues() {
        if (hungriness < 0) hungriness = 0;
        if (hungriness > 10) hungriness = 10;

        if (happiness < 0) happiness = 0;
        if (happiness > 10) happiness = 10;

        if (cleanness < 0) cleanness = 0;
        if (cleanness > 10) cleanness = 10;

        if (tiredness < 0) tiredness = 0;
        if (tiredness > 10) tiredness = 10;
    }

    // Example test
    public static void main(String[] args) {
        Tamagotchi t = new Tamagotchi();

        System.out.println("Mood: " + t.getMood());
        t.feed();
        t.walk();
        t.clean();
        t.pet();
        t.passTime();
        System.out.println("Mood now: " + t.getMood());
    }
}
