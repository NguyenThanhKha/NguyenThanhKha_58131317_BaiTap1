/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenThanhKha_58131317_BaiTap1;

/**
 *
 * @author HP
 */
public class GiaoVien extends CaNhan{
    String monDay,toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
