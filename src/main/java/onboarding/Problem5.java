package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    
    private final static int[] MONEY_UNIT_ARRAY = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    
    public static List<Integer> solution(int money) {
        List<Integer> answer = withdrawalMoney(money);
        
        for(int unit : MONEY_UNIT_ARRAY) {
            answer.add(money / unit);
            money %= unit;
        }

        return answer;
    }

}
