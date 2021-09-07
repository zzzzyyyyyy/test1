import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.nextLine();

            int[] count = new int[52];

            for(int i=0; i<str1.length(); i++){
                char a = str1.charAt(i);
                    int b = a - 65;
                    count[b] = count[b] + 1;
            }


            for(int j=0; j<count.length; j++){
                if(count[j]!=0)
                    System.out.println("字母"+(char)(j+65)+"出现次数："+count[j]);
            }

        }
    }

