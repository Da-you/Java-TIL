package org.example.start.cond;

public class CondEx1 {

    /*
   "A": "탁월한 성과입니다!"
   "B": "좋은 성과입니다!"
   "C": "준수한 성과입니다!"
   "D": "향상이 필요합니다."
   "F": "불합격입니다."
   나머지: "잘못된 학점입니다."
     */
    public static void main(String[] args) {

        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("탁월한 성적");
                break;
            case "B":
                System.out.println("좋은 성적");
                break;
            case "C":
                System.out.println("준수한 성적");
                break;
            case "D":
                System.out.println("노력 필요 성적");
                break;
            case "F":
                System.out.println("불합");
                break;
            default:
                System.out.println("성적 오류");

        }
    }

}
