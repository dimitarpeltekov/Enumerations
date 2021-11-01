package Encapsulation;

public enum Discount {
    VIP(0.20), SECOND_VISIT(0.10),NONE(0.0);

    private double percentage;

    Discount(double percentage){
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public static Discount fromString(String discountAsString){
        return switch (discountAsString){
            case "VIP"-> VIP;
            case "SecondVisit" -> SECOND_VISIT;
            case "None" -> NONE;
            default -> throw new IllegalArgumentException("Unknown discount type"+discountAsString);
        };
    }

}
