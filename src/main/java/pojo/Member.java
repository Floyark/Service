package pojo;

import java.io.Serializable;

public class Member implements Serializable {
    private Integer member_Id;
    private String member_name;
    private String member_nick;
    private String member_phone;
    private String member_email;
    private String member_address;

    @Override
    public String toString() {
        return "Member{" +
                "member_Id=" + member_Id +
                ", member_name='" + member_name + '\'' +
                ", member_nick='" + member_nick + '\'' +
                ", member_phone='" + member_phone + '\'' +
                ", member_email='" + member_email + '\'' +
                ", member_address='" + member_address + '\'' +
                '}';
    }

    public Integer getMember_Id() {
        return member_Id;
    }

    public void setMember_Id(Integer member_Id) {
        this.member_Id = member_Id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_nick() {
        return member_nick;
    }

    public void setMember_nick(String member_nick) {
        this.member_nick = member_nick;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }
}
