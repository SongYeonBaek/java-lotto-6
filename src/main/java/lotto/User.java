package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public int getAmount() {
        return amount;
    }
    public List<Integer> getAnswer() {
        return answer;
    }

    public int amount;


    public List<Integer> answer = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void inputAmount(){
        System.out.println("구입금액을 입력해 주세요.");

        int inputAmount = sc.nextInt();
        inputAmount /= 1000;
        this.amount = inputAmount;
    }

    void inputAnswer(){
        System.out.println("당첨 번호를 입력해 주세요.");
        String[] str = sc.nextLine().split(",");

        for (int i = 0; i < str.length; i++) {
            int a = sc.nextInt();

            answer.add(i, Integer.parseInt(str[i]));
        }
        System.out.println("보너스 번호를 입력해 주세요.");
        answer.add(sc.nextInt());
    }

    void printAnswer(){
        System.out.println(answer);
    }
}
