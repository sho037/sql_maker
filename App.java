import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        // mode
        System.out.println("mode: 1: select * from");
        if (input.nextInt() == 1) {
            // 読み込み
            while (input.hasNext()) {
                list.add(input.next());
            }

            // 出力
            for (int i = 0; i < list.size(); i++) {
                System.out.println("SELECT * FROM " + list.get(i) + ";");
            }
        } else {
            
        }
        
        sc.close();
        return;
    }
}