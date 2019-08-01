import java.lang.reflect.Array;
import java.util.Arrays;
/*
to be continued
using methods in shortcuts as I go
 */
public class MealPlan {
    public static void main(String[] args) {
        int numWeeks = getTotalMealWeeks();
        double[] dailyMealCost = new double[7];
        System.out.println("Before calling the method: " + Arrays.toString(dailyMealCost));
        
        getDailyMealCost(dailyMealCost);

        System.out.println("After calling the method: " + Arrays.toString(dailyMealCost));
        
        double totalCost = computeMealPlanCost(numWeeks, dailyMealCost);
    }

    private static double computeMealPlanCost(int numWeeks, double[] dailyMealCost) {
    }

    private static void getDailyMealCost(double[] dailyMealCost) {
        
    }

    public static int getTotalMealWeeks() {
        
    }
}
