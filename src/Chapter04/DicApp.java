package Chapter04;
import java.util.Scanner;

class Dictionary {
    private String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private String[] eng = {"love", "baby", "money", "future","hope"};
    public String kor2Eng(String word) {
        for(int i=0; i<kor.length;i++) {
            if(word.equals(kor[i])) {
                return eng[i];
            }
        }
        return "단어없음";
    }
}

public class DicApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        Dictionary dic = new Dictionary();

        while(true) {
            System.out.print("한글 단어?");
            String search = sc.next();

            if(search.equals("그만"))
                break;
        }
        sc.close();
    }
}