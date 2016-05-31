package kr.domaindriven.model.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by donghoon on 2016. 5. 31..
 * 이 클래스는 운영진 추가 폼에서 전달 받은 데이터를 위해 만들었음.
 */
public class WorkerForm {

    @NotNull
    @Size(min = 2, max = 20)
    private String name;
    @NotNull
    @Size(min = 2)
    private String phone;
    @NotNull
    @Size(min = 2, max = 30)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
