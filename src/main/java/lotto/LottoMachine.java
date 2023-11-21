package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    List<Integer> lottoNumber = new ArrayList<>();

    List<List<Integer>> lottoNumbers = new ArrayList<>();

    public List<Integer> getAnswer() {
        return answer;
    }

    List<Integer> answer = new ArrayList<>();

    public int amount;

    public List<List<Integer>> getLottoNumbers() {
        return lottoNumbers;
    }

    void getUser(){
        User user = new User();
        user.inputAmount();
        this.amount = user.getAmount();
        user.inputAnswer();
        user.printAnswer();
        this.answer = user.getAnswer();
    }
    void generateLotto(){
        for (int i = 0; i < amount; i++) {
            lottoNumber = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lottoNumbers.add(lottoNumber);
            System.out.println(lottoNumbers.get(i));
        }
    }
}