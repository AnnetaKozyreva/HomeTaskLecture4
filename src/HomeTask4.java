import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        String[] wordsArray;
        int maxLength, filterNum;
        String stringFilter;
        String result = "";
        String phrase1;
        boolean flagExit = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите,пожалуйста, 3 слова через запятую : ");
        phrase1 = sc.nextLine();
        wordsArray = phrase1.split(",");
        do{
            System.out.println(" 1 - maximum length");
            System.out.println(" 2 - start with");
            System.out.println(" 3 - end with");
            System.out.println(" 4 - contains");
            System.out.println(" 0 - exit");
            filterNum = sc.nextInt();

            switch (filterNum) {
                case 1 :
                    System.out.println("maximum length");
                    maxLength = sc.nextInt();
                    for (int i=0;i<wordsArray.length;i++){
                        if (wordsArray[i].length()<=maxLength){
                            result += wordsArray[i] + ",";
                        }
                    }
                    break;
                case 2 :
                    System.out.println("start with");
                    stringFilter = sc.next();
                    for (int i=0;i<wordsArray.length;i++){
                        if (wordsArray[i].substring(0,stringFilter.length()).equals(stringFilter) ) {
                            result += wordsArray[i] + ",";
                        }
                    }
                    break;
                case 3 :
                    System.out.println("end with");
                    stringFilter = sc.next();
                    for (int i=0;i<wordsArray.length;i++){
                        if (wordsArray[i].substring(wordsArray[i].length()-stringFilter.length()).equals(stringFilter) ) {
                            result += wordsArray[i] + ",";
                        }
                    }
                    break;
                case 4 :
                    System.out.println("contains");
                    stringFilter = sc.next();
                    for (int i=0;i<wordsArray.length;i++){
                        if (wordsArray[i].contains(stringFilter) ) {
                            result += wordsArray[i] + ",";
                        }
                    }
                    break;
                case 0 :
                    System.out.println("exit");
                    flagExit = false;
                    break;
            }
            if (result.length() > 0) {
                result = result.substring(0, result.length() -1);
                System.out.println("Result words : " + result);
                result = "";
            }
        }
        while(flagExit);
    }
}