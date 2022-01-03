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
        System.out.println("Please, enter 3 words separated by commas: ");

            phrase1 = sc.nextLine();
            wordsArray = phrase1.split(",");
            do {
                System.out.println("Please select a filter: ");
                System.out.println(" 1 - maximum length");
                System.out.println(" 2 - start with");
                System.out.println(" 3 - end with");
                System.out.println(" 4 - contains");
                System.out.println(" 0 - exit");
                filterNum = sc.nextInt();

                switch (filterNum) {
                    case 1:
                        System.out.println("Enter maximum length");
                        maxLength = sc.nextInt();
                        for (int i = 0; i < wordsArray.length; i++) {
                            if (wordsArray[i].length() <= maxLength) {
                                result += wordsArray[i] + ",";
                            }else {
                                System.out.println("Not matched");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter 'start with' letters");
                        stringFilter = sc.next();

                        for (int i = 0; i < wordsArray.length; i++) {
                            if (wordsArray[i].startsWith(stringFilter)) {
                                result += wordsArray[i] + ",";
                            }else {
                                System.out.println("Not matched");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter 'end with' letters");
                        stringFilter = sc.next();
                        for (int i = 0; i < wordsArray.length; i++) {
                            if (wordsArray[i].endsWith(stringFilter)) {
                                result += wordsArray[i] + ",";
                            }else {
                                System.out.println("Not matched");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter contained letters");
                        stringFilter = sc.next();
                        for (int i = 0; i < wordsArray.length; i++) {
                            if (wordsArray[i].contains(stringFilter)) {
                                result += wordsArray[i] + ",";
                            }else {
                                System.out.println("Not matched");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Exiting program");
                        flagExit = false;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                    System.out.println("Result words : " + result);
                    result = "";
                } else {
                    System.out.println("");
                }
            }
            while (flagExit);
        }
    }
