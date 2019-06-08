import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Double, Character> hash = new HashMap<>();
    static ArrayList<Double> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String[] line = { scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine() };
        for(int i = 0; i < line.length; i++){
            String book = line[i].split(" # ")[1].split("-")[0];
            double d = Double.parseDouble(book);
            list.add(d);
            hash.put(d, (char) (65 + i));
        }

        list.sort(null);

        for(int i = 0; i < list.size(); i++){
            System.out.println(hash.get(list.get(i)) + " : " + list.get(i));
        }

    }
}


//
//        ✔ "시간은 이야기가 된다" # 814.7-강53ㅅ
//        ✔ "(평생 경력단절 없는) 엄마의 공부방  : 이제 아이들은 학원 말고 공부방 간다!" # 325.21-임45ㅇ
//        ✔ "내 몸에 길 하나 생긴 후  : 임후남 시집" # 811.7-임97ㄴ
//        ✔ "라떼아트, 행복을 그리는 시간" # 573.93-엄845ㄹ
//        ✔ "헬싱키 로카마티오 일가 이면의 사실들  : 얀 마텔 소설" # 843.5-마833ㅎ