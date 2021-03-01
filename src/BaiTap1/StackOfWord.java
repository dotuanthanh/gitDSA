package BaiTap1;

import com.company.Main;

import java.util.List;
import java.util.Scanner;

public class StackOfWord {
    public static void main(String[] args) {
        Main.MyGenericStack<String> wStack = new Main.MyGenericStack();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            String wWord = scanner.nextLine();
            wStack.push(wWord);
            i++;
        }
        String[] mWord = new String[wStack.size()];
        for (i = 0; i < wStack.size(); i++) {
            mWord[i] = wStack.pop();
        }
    }
}
