public class FeetMeterConversion{
    public static void main(String[] args){

        System.out.printf("%-10s%-18s%-10s%-10s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("__________________________________________");
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "1", footToMeter(1), "20", meterToFoot(20));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "2", footToMeter(2), "25", meterToFoot(25));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "3", footToMeter(3), "30", meterToFoot(30));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "4", footToMeter(4), "35", meterToFoot(35));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "5", footToMeter(5), "40", meterToFoot(40));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "6", footToMeter(6), "45", meterToFoot(45));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "7", footToMeter(7), "50", meterToFoot(50));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "8", footToMeter(8), "55", meterToFoot(55));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "9", footToMeter(9), "60", meterToFoot(60));
        System.out.printf("%-10s%-18s%-10s%-10.3f\n", "10", footToMeter(10), "65", meterToFoot(65));
    
    
    
    }

    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }


}
