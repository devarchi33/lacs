/**
 * Created by jerry on 2016-05-18.
 */

//선택한 값 넘겨주기
function getSelectValue(frm)
{
    var InstructorIndex = frm.instructorName.selectedIndex;
    /*alert(document.getElementById('p'+InstructorIndex).innerHTML);*/
    frm.instructorPhoneNum.value = document.getElementById('p'+InstructorIndex).innerHTML;
}
