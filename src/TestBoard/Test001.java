package TestBoard;

public class Test001 {
    public static void main(String[] args) {
        String s = "My name is Tom";
        String [] str = s.split(" ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ')
                System.out.println(s.charAt(i-1)+"와"+c);
        }
    }
}
