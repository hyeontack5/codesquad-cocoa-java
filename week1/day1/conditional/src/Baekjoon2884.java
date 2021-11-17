import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (min < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            sb.append(hour).append(" ");

            min = 60 - (45 - min);
            sb.append(min);
        } else {
            sb.append(hour).append(" ").append(min - 45);
        }

        System.out.println(sb);
    }
}
