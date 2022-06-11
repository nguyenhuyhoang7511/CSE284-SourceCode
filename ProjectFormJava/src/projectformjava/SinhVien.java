package projectformjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String fullname ;
    private Integer age;    

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public SinhVien(String fullname, Integer age, String address) {
        this.fullname = fullname;
        this.age = age;
        this.address = address;
    }
    private String address;
    public SinhVien() {
    }
}
