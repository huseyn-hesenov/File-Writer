import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {



    public static void main(String[] args) throws IOException {

try(FileWriter fileWriter=new FileWriter("huseyn.txt")){
    Scanner scanner=new Scanner(System.in);
    int say=0;
    while (say<5){
        System.out.println("data daxil edin");
        String oxunanDAeyer=scanner.nextLine();
        fileWriter.write(oxunanDAeyer+"\n");


        say++;

    }
    System.out.println("daxil etme say haqqiniz bitti");

}catch (IOException e){
    System.out.println("problem");
}






    }
}
