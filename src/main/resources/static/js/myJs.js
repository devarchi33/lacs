/**
 * Created by jerry on 2016-05-18.
 */

//선택한 값 넘겨주기
function getSelectValue(frm)
{
    var InstructorIndex = frm.selectBox.selectedIndex;
    /*alert(document.getElementById('p'+InstructorIndex).innerHTML);*/
    frm.phoneNumber.value = document.getElementById('p'+InstructorIndex).innerHTML;
}
