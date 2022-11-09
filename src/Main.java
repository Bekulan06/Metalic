public class Main {
    public static void main(String[] args) {
        double [] Joseph = {-23, 8.4, 1.4, -0.3, 2.3, -9.3, 2.3, -7.22, -6.994, 2.9, 4.5, -3.45, -9.5, -4.55, 8.2,};
        double stand = 0.0;
        int hamon = 0;

        for (int gun = 0; gun < Joseph.length; gun++) {


            if (Joseph[gun] < 0){
                for (int gun2 = 0; gun2 < Joseph.length; gun2++) {

                    if (Joseph[gun2] > 0) {
                        stand = stand + Joseph[gun2];
                        
                        hamon++;
                    }
                    
                }
            }
            break;
            
        }
        System.out.println("Среднее Арифметическое " + stand/hamon);


    }
}