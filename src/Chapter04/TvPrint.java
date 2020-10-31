package Chapter04;
class TV {
    private String company;
    private int year, inch = 0;
    public TV (String company, int year, int inch) {
        this.company = company;
        this.year = year;
        this.inch = inch;
    }
    public void show() {
        System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }
}
public class TvPrint {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
