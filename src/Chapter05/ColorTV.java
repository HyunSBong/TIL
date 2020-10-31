package Chapter05;
class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}
class ColorTV extends TV {
    private int colors;

    ColorTV(int size, int colors) {
        super(size);
        this.colors = colors;
    }
    protected int getColors() {
        return colors;
    }
    public void printProperty() {
        System.out.println(getSize()+"인치 "+colors+"컬러");
    }
}
class IPTV extends ColorTV { // 파일명이 IPTV 일 때 public class 가능
    private String address;
    IPTV(String address, int size, int colors) {
        super(size,colors);
        this.address = address;
    }
    public void printProperty() {
        System.out.println("나의 IPTV는 "+address+"주소의 "+getSize()+"인치 "+getColors()+"컬러");
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
