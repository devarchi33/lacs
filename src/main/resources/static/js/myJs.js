/**
 * Created by jerry on 2016-05-18.
 */

//선택한 값 넘겨주기
function getSelectValue()
{
    var target = document.getElementById("selectedInstructor");
    var selectedInstructorId= target.options[target.selectedIndex].id;
    alert(selectedInstructorId);
    document.getElementById("phone").value = document.getElementById("pn"+ selectedInstructorId).innerHTML;
}
