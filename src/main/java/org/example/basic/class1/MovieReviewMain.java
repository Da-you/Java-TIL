package org.example.basic.class1;

public class MovieReviewMain {

    public static void main(String[] args) {
        // 영화 리뷰 정보 서언
        MovieReview mr1 = new MovieReview();
        mr1.title = "조커2: 폴리아되";
        mr1.review = "재미 없음";

        MovieReview mr2 = new MovieReview();
        mr2.title = "인셉션";
        mr2.review = "하루 잡고 봐야함";

        MovieReview[] reviews = {mr1, mr2};

        // 영화 리뷰 정보 출력
        for (int i = 0; i < reviews.length; i++) {
            System.out.println("제목 : " + reviews[i].title + "평가 : " + reviews[i].review);

        }
    }

}
