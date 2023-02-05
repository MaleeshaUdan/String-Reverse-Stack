import java.util.Scanner;

class StringReverse {
    int arr_size;
    char[] arr;
    int top = -1;

    public StringReverse(int arr_size) {
        this.arr_size = arr_size;
        this.arr = new char[arr_size];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == (arr_size - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char x) {
        if (isFull() == true) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public char pop() {
        if (isEmpty() == true) {
            return '0';
        } else {
            char temp = arr[top];
            top--;
            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Word/Sentence");
        String sentence = sc.nextLine();

        int sentence_size = sentence.length();
        StringReverse str = new StringReverse(sentence_size);

        for (int i = 0; i < sentence_size; i++) {
            str.push(sentence.charAt(i));
        }
        for (int i = 0; i < sentence_size; i++) {
            System.out.print(str.pop());
        }
    }
}
