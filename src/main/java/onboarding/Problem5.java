package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    
    private final static int[] MONEY_UNIT_ARRAY = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    
    public static List<Integer> solution(int money) {
        List<Integer> answer = withdrawalMoney(money);

        return answer;
    }
    
    private static List<Integer> withdrawalMoney(int money){
        List<Integer> countingUnits = new ArrayList<>();
        
        for(int unit : MONEY_UNIT_ARRAY) {
            countingUnit.add(money / unit);
            money %= unit;
        }
        
        return countingUnits;
    }

}
