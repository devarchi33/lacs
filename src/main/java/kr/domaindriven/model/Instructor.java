package kr.domaindriven.model;

/**
 * Created by jerry on 2016-05-18.
 * 이 클래스는 강사를 위해 만들었음
 */
public class Instructor {

    private Long id=0L;
    private String name;
    private String phoneNumber;
    private String mail;
    private String account;

    public Instructor(String name, String phoneNumber, String mail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.account = "None";
        id++;
    }

    public Instructor(String name, String phoneNumber, String mail, String account) {
        this(name, phoneNumber, mail);
        this.account = account;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


}
