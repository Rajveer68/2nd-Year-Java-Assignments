package LAB4;

import java.util.Scanner;

public class Tamagotchi {
    private int hungriness;
    private int happiness;
    private int cleanness;
    private int tiredness;

    // Constructor — starting state
    public Tamagotchi() {
        this.hungriness = 5;
        this.happiness = 5;
        this.cleanness = 5;
        this.tiredness = 5;
    }

    // ====== Getters ======
    public int getHungriness() { return hungriness; }
    public int getHappiness() { return happiness; }
    public int getCleanness() { return cleanness; }
    public int getTiredness() { return tiredness; }

    // ====== Actions ======
    public void feed() {
        hungriness -= 5;
        if (hungriness < 0) hungriness = 0;
        System.out.println("You fed your Tamagotchi.");
    }

    public void walk() {
        happiness += 3;
        tiredness += 2;
        limitValues();
        System.out.println("You took your Tamagotchi for a walk.");
    }

    public void clean() {
        cleanness += 10;
        if (cleanness > 10) cleanness = 10;
        System.out.println("You cleaned your Tamagotchi.");
    }

    public void pet() {
        happiness += 5;
        if (happiness > 10) happiness = 10;
        System.out.println("You petted your Tamagotchi.");
    }

    // ====== Mood Logic ======
    public String getMood() {
        if (tiredness == 10) return "asleep";
        else if (tiredness >= 8) return "tired";
        else if (hungriness >= 7) return "hungry";
        else if (cleanness < 3) return "dirty";
        else if (happiness >= 8) return "happy";
        else if (happiness >= 4) return "ok";
        else return "sad";
    }

    // ====== Pass Time ======
    public void passTime() {
        hungriness += 1;
        cleanness -= 1;
        if (tiredness == 10) {
            tiredness = 0;
            System.out.println("Your Tamagotchi slept and feels refreshed!");
        } else {
            tiredness += 1;
        }

        if (hungriness >= 7) happiness -= 1;
        if (cleanness < 3) happiness -= 1;

        limitValues();
        System.out.println("Time passes...");
    }

    // ====== Clamp values between 0 and 10 ======
    private void limitValues() {
        hungriness = Math.max(0, Math.min(10, hungriness));
        happiness = Math.max(0, Math.min(10, happiness));
        cleanness = Math.max(0, Math.min(10, cleanness));
        tiredness = Math.max(0, Math.min(10, tiredness));
    }

    // ====== Show stats ======
    public void showStats() {
        System.out.println("\nTamagotchi Status:");
        System.out.println("Hungriness: " + hungriness);
        System.out.println("Happiness:  " + happiness);
        System.out.println("Cleanness:  " + cleanness);
        System.out.println("Tiredness:  " + tiredness);
        System.out.println("Mood:       " + getMood());
    }

    // ====== Interactive main ======
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tamagotchi t = new Tamagotchi();

        System.out.println("Welcome to Tamagotchi!");
        System.out.println("Available actions: feed, walk, clean, pet, pass, quit");

        boolean playing = true;
        while (playing) {
            t.showStats();
            System.out.print("\nWhat would you like to do?\n");
            String action = sc.nextLine().toLowerCase();

            switch (action) {
                case "feed":
                    t.feed();
                    break;
                case "walk":
                    t.walk();
                    break;
                case "clean":
                    t.clean();
                    break;
                case "pet":
                    t.pet();
                    break;
                case "pass":
                    t.passTime();
                    break;
                case "quit":
                    playing = false;
                    System.out.println("Bbye!");
                    continue;
                default:
                    System.out.println("Invalid action!");
                    continue;
            }

            // Every action makes time pass automatically
            t.passTime();
        }

        sc.close();
    }
}
