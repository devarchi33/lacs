/**
 * Created by donghoon on 2016. 5. 27..
 */
$(document).ready(function () {
    $('input[name="daterange"]').daterangepicker();
    $("#seminarDate").datepicker();
    $("#seminars").DataTable();
    $(".instructor-multiple").select2();

    $("#addSeminar").on("click", function () {
        var seminarTitle = $("#seminarTitle").val();
        var seminarDate = $("#seminarDate").val();
        var checkSubmit = confirm("세미나 타이틀: " + seminarTitle + ", 세미나 날짜: " + seminarDate + "등록 하시겠습니까?");

        if (checkSubmit) {
            $.ajax({
                type: "post",
                async: true,
                dataType: "json",
                url: "/seminar",
                data: {
                    title: seminarTitle,
                    date: seminarDate
                },
                success: function (response) {
                    alert(response.title + ", " + response.date + " 저장에 성공하였습니다.");
                    $("#seminarTitle").attr("placeholder", "ex) 개발자 경력 개발 세미나.");
                    $("#seminarDate").attr("placeholder", "ex) 05/29/2016");
                },
                error: function (error) {
                    console.log("세미나 저장 실패.");
                    console.log(error);
                    if (error.responseText === "") {
                        $("#seminarTitle").attr("placeholder", "세미나 타이틀은 비어 있으면 안됩니다.");
                        $("#seminarDate").attr("placeholder", "세미나 예정일은 비어 있으면 안됩니다.");
                    }
                }
            })
        }
    });
});
