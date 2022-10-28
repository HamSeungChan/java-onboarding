package onboarding;

import java.util.List;

class Problem1 {

  private static final int pobi_Win = 1;
  private static final int crong_Win = 2;
  private static final int draw = 0;
  private static final int LeftPage = 0;
  private static final int RightPage = 1;

  public static int solution(List<Integer> pobi, List<Integer> crong) {
    int answer = Integer.MAX_VALUE;

    return answer = Winner(pobi,crong);
  }

  private static int Winner (List<Integer> pobi, List<Integer> crong){

    int pobi_Score = CompareScore(pobi);
    int crong_Score = CompareScore(crong);
    int result = Integer.MAX_VALUE;

    if(pobi_Score>crong_Score) result = pobi_Win;
    else if(pobi_Score==crong_Score) result = draw;
    else result = crong_Win;

    return result;
  }

  private static int CompareScore(List<Integer> page){
    int LeftPage_Score = PageBestScore(page.get(LeftPage));
    int RightPage_Score = PageBestScore(page.get(RightPage));
    return Math.max(LeftPage_Score,RightPage_Score);
  }

  private static int PageBestScore(int bookpage){
    return Math.max(Plus_Score(bookpage),Multiply_Score(bookpage));
  }

  private static int Plus_Score(int bookpage){
    int plusScore = 0;
    while(bookpage !=0) {
      plusScore += bookpage % 10;
      bookpage = bookpage / 10;
    }
    return plusScore;
  }

  private static int Multiply_Score(int bookpage) {
    int multiplyScore = 1;
    while(bookpage !=0) {
      multiplyScore *= bookpage % 10;
      bookpage = bookpage / 10;
    }
    return multiplyScore;
  }

}

