package kr.domaindriven.model;

/**
 * Created by jerry on 2016-06-01.
 */
public enum LacsCnstE {

    CAST_INSTRUCTOR("강사 섭외", "/castingInstructor"), RESERVE_PLACE("장소 예약", "/reservingPlace"), MAKE_POSTER("포스터 제작", "/makingPoster"),
    REGISTER_SEMINAR("세미나 등록", "/registeringSeminar"), PROMOTION("홍보", "/promoting"), REMEMBERANCE("회고", "/rememberancing");

    private String taskName;
    private String URL;

    private LacsCnstE(String taskName, String URL) {
        this.taskName = taskName;
        this.URL = URL;
    }
}
