import java.util.Scanner;

public class Subway {
    public static void main(String [] args){
        new Subway();
        
        System.out.println("����1");
        new FileOperateOp("-map", "D:\\java\\subway\\src\\subway.txt");
        System.out.println("����2");
        new FileOperateOp("-a", "6����", "-map", "D:\\java\\subway\\src\\subway.txt", "-o", "station.txt");
        System.out.println("����3");
        System.out.println();
        new FileOperateOp("-b", "ƻ��԰ ","���� ","-map","D:\\java\\subway\\src\\subway.txt","-o","routine.txt");
    }
}
