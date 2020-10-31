import java.util.Scanner;
class Box {
    private int width = 10;
    private int height = 10;
    private int length = 10;
    private int volume;
    private static int boxes = 0; //객체 생성마다 1++
    public static int getBoxes() {
        return boxes;
    }
    Box() {}
    Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        boxes++;
    }
    public int getVolume() {
        volume = width*length*height;
        return volume;
    }

}
public class Mid_exam03 {
    public static void main(String[] args) {
        int width;
        int length;
        int height;
        Box box[] = new Box[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("가로 세로 높이를 각각 입력해주세요 : ");
            width = sc.nextInt();
            length = sc.nextInt();
            height = sc.nextInt();
            box[i] = new Box(width,length,height);
        }
        System.out.println("총 "+Box.getBoxes()+"개의 객체 생성");
        for (int i = 0; i < box.length; i++) {
            System.out.println(i+1+"번째 상자의 부피 : "+box[i].getVolume());
        }
    }
}

