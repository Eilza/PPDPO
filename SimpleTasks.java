import java.util.Scanner;

public class SimpleTasks {

        public static void main(String[] args) {
            boolean strangeWord;
            char[] vowels={'e','y','u','i','o','a'};
            Scanner scanner = new Scanner(System.in);
            int n = Integer.valueOf(scanner.nextLine());
            for(int i=0;i < n; i++){
                strangeWord = false;
                String word = scanner.nextLine();
                String lowWord = word.toLowerCase();
                int l = lowWord.length();
                for (int k=0;k<l-2;k++){
                    for(char c:vowels){
                        if((lowWord.charAt(k)==c)&&(lowWord.charAt(k+1)==c)&&(lowWord.charAt(k+2)==c)){
                            strangeWord = true;
                            break;
                        }
                    }
                    if (strangeWord){
                        break;
                    }
                }
                if (!strangeWord){
                    System.out.println(word);
                }
            }
        }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int maxMax = 0;
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            arr[i] = next;
            if (next > max) {
                maxMax = max;
                max = next;
            } else if (next == max) {
                    max = next;
                }
            else {
                if (next > maxMax) {
                    maxMax = next;
                }
            }
        }
        if (max > 2 * maxMax) {
            maxMax = max / 2;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = arr[i] / 2;
            }
            if (arr[i] == maxMax) {
                arr[i] = arr[i] / 2;
            }
            System.out.println(arr[i]);
        }


    }*/
}
