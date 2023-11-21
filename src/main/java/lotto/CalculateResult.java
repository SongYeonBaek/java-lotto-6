package lotto;

import java.util.ArrayList;
import java.util.List;

public class CalculateResult {
    List<List<Integer>> lottoNumbers = new ArrayList<>();
    public List<Integer> answer = new ArrayList<>();

    //결과 값 저장을 위한 변수
    int[] result = {0,0,0,0,0};
    double rate;

    void getUserInput(){
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.getUser();
        lottoMachine.generateLotto();
        this.lottoNumbers = lottoMachine.getLottoNumbers();
        System.out.println(" ============== ");
        this.answer = lottoMachine.getAnswer();
    }

    void calculate(){
        List<Integer> number = new ArrayList<>();
        int count;
        for(int i = 0; i < lottoNumbers.size(); i++) {
            number = lottoNumbers.get(i);
            count = 0;
            for(int j=0; j < number.size(); j++){
                //보너스 번호 계산
                if(j==6 && count==4) result[3]++;
                else if(answer.contains(number.get(j))) count++;
            }
            System.out.print(count);
            if(count == 3) result[0]++;
            else if(count == 4) result[1]++;
            else if(count == 5) result[2]++;
            else if(count == 6) result[4]++;
        }

        rate = 5000*result[0] + 50000*result[1] + 1500000*result[2] + 30000000*result[3] + 2000000000*result[4];
        rate /= lottoNumbers.size() * 1000 * 100;
    }

    void printResult(){
        System.out.println("\n당첨 통계\n---");
        System.out.println("3개 일치 (5,000원) - " + result[0] +"개");
        System.out.println("4개 일치 (50,000원) - " + result[1] +"개");
        System.out.println("5개 일치 (1,500,000원) - " + result[2]  +"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + result[3] +"개");
        System.out.println("6개 일치 (2,000,000,000원) - " + result[4] +"개");
        System.out.printf("총 수익률은" + "%.1f" +" %% 입니다.", rate);

    }

}
