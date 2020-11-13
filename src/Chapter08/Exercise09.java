package Chapter08;

import java.io.File;

public class Exercise09 {
    public static void main(String[] args) {
        /* c:\temp 에 있는 .txt 파일만 삭제하는 프로그램을 작성하라.
        c:\나 c:\Windows 등의 디렉터리에 적용하면 중요한 파일이 삭제될 수 있으니 조심하라.
         */
        /*메서드에 문자열을 입력하면 위치에따라 숫자로 반환한다.
           int indexOf(String s){
                return number;}
           lastIndexOf는 오른쪽부터 문자열을 세기때문에 lastIndexOf는 파일확장자같은 것에 사용된다.
           */
        File f = new File("/Library/temp");
        File[] fileList = f.listFiles();

        System.out.println(f.getPath() + "디렉터리의 모든 .txt 파일을 삭제합니다.");
        int count = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (!fileList[i].isFile())
                continue;
            String name = fileList[i].getName();
            int index = name.lastIndexOf(".");
            String extension = name.substring(index);
            if (extension.equals(".txt")) {
                System.out.println(fileList[i].getPath() + "삭제");
                fileList[i].delete();
                count++;
            }
        }
        System.out.println("총 " + count + "개의 .txt 파일을 삭제하였습니다.");
    }
}