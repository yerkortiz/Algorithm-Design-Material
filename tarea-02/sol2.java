import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class problema2{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), pos = sc.nextInt();
        List<Integer> vi = new ArrayList<Integer>();
        for (int j = 0; j < m; j++) 
            vi.add(sc.nextInt());
        int tot = 0;
        while (true) {
            boolean ada = false;
            for (int j = 1; j < vi.size(); j++) 
                if (vi.get(j) > vi.get(0)) {
                    ada = true;
                    break;
                }
            if (!ada) {
                tot++;
                vi.remove(0);
            } else {
                int x = vi.get(0);
                vi.remove(0);
                vi.add(x);
            }
            if (pos == 0 && !ada) 
                break;
            pos--;
            if (pos < 0) 
                pos = vi.size() - 1;
        }
        System.out.println(tot);
    }
}