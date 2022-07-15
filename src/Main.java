public class Main {
    public static void main(String[] args) {


        // задача 1
        byte bun = 4;
        short apples = 12;
        int unicorn = 20;
        long ponyTails = 10_000L;
        float twixBar = 10.5f;
        double candle = 20.2;
        char a = 43;
        boolean isAdult = unicorn >= 10;
        //задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double allBoxersWeight = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("общий вес боксеров " + allBoxersWeight + " кг");
        System.out.println("разница в весе боксеров " + weightDifference + " кг");
        //задача 3
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака " + breakfast + " грамм");
        double kiloBreakfast = breakfast / 1000;
        System.out.println("Общий вес завтрака " + kiloBreakfast + " кг");
        //задача 4
        int extraWeight = 7_000;
        int weightLoss = 250;
        int daysOfWeightLoss = extraWeight / weightLoss;
        System.out.println("Дней дo потери веса первый сценарий " + daysOfWeightLoss);
        int weightLossHard = 500;
        int daysOfWeightLossHard = extraWeight / weightLossHard;
        System.out.println("Дней до потери веса второй сценарий " + daysOfWeightLossHard);
        int averageWeightLoss = (daysOfWeightLoss + daysOfWeightLossHard) / 2;
        System.out.println("В среднем для потери веса " +  averageWeightLoss + " день");
        //задача 5
        int Masha = 67_760;
        int Denis = 83_690;
        int Christina = 76_230;
        int MashaNew = Masha / 100 * 10 + Masha;
        int DenisNew = Denis / 100 * 10 + Denis;
        int ChristinaNew = Christina / 100 * 10 + Christina;
        int MashaYearDifference = MashaNew * 12 - Masha * 12;
        int DenisYearDifference = DenisNew * 12 - Denis;
        int ChristinaYearDifference = ChristinaNew * 12 - Christina;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaYearDifference + " рублей.");








    }



}