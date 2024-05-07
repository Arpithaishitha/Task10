// Tea class
class Tea {
    // Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }
}

// BlackTea class
class BlackTea extends Tea {
    // Method to prepare black tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves, and brewing for 5 minutes.");
    }
}

// GreenTea class
class GreenTea extends Tea {
    // Method to prepare green tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves, and brewing for 3 minutes.");
    }
}

// HerbalTea class
class HerbalTea extends Tea {
    // Method to prepare herbal tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves, and brewing for 7 minutes.");
    }
}

// Main class
public class Teatest6 {
    public static void main(String[] args) {
        // Create objects of each tea type
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        // Prepare each type of tea
        System.out.println("Preparing black tea:");
        blackTea.prepareTea();

        System.out.println("\nPreparing green tea:");
        greenTea.prepareTea();

        System.out.println("\nPreparing herbal tea:");
        herbalTea.prepareTea();
    }
}
