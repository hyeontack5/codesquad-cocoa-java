import java.util.Scanner;

public class RandomDraw {

    private String[] memberList = {
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루"};

    private int inputHeadCount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명인가요? ");
        int number = sc.nextInt();

        if (number > memberList.length || number < 1) {
            System.out.println("다시 입력해주세요!");

            return inputHeadCount();
        }

        sc.close();
        return number;
    }

    private String[] shuffle(String[] array) {
        String temp = "";
        int random = 0;
        for (int i = 0; i < array.length; i++) {
            random = (int) (Math.random() * array.length);
            temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }

        return array;
    }

    private void printName(int num, String[] members) {

        for (int i = 0; i < num; i++) {
            System.out.print(members[i]);
            if (i != num - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {

        RandomDraw randomdraw = new RandomDraw();
        int headcount = randomdraw.inputHeadCount();
        String[] randomMembers = randomdraw.shuffle(randomdraw.memberList);
        randomdraw.printName(headcount, randomMembers);
    }

}

