import java.util.Scanner;

public class Subway {
    public static void main(String [] args){
        new Subway();
        
        System.out.println("功能1");
        new FileOperateOp("-map", "D:\\java\\subway\\src\\subway.txt");
        System.out.println("功能2");
        new FileOperateOp("-a", "6号线", "-map", "D:\\java\\subway\\src\\subway.txt", "-o", "station.txt");
        System.out.println("功能3");
        System.out.println();
        new FileOperateOp("-b", "苹果园 ","西单 ","-map","D:\\java\\subway\\src\\subway.txt","-o","routine.txt");
    }
}
