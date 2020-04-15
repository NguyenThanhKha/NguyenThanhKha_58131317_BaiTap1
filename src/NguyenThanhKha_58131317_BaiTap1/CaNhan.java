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
public abstract class  CaNhan 
{
        String hoTen,diaChi,sdt;
        int tuoi;
   public CaNhan()
   {
   }

    public CaNhan(String hoTen, String diaChi, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String HienThiTT() {
        return "CaNhan{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", tuoi=" + tuoi + '}';
    }
    
    
}

