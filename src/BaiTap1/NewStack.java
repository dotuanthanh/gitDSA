package BaiTap1;
import com.company.*;
public class NewStack {
    public static void main(String[] args) {
        Main.MyGenericStack<Integer> stack = new Main.MyGenericStack();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : array) {
            stack.push(j);
        }
        for (int i = 0; i < stack.size(); i++) {
            array[i] = stack.pop();
        }
    }
}