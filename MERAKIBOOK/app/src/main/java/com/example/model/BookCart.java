package com.example.model;

public class BookCart {

    private String txtTenSach, txtTacGia;
    private int imvSach;
    private double txtGiaSach;

    public void setTxtTenSach(String txtTenSach) {
        this.txtTenSach = txtTenSach;
    }

    public void setTxtTacGia(String txtTacGia) {
        this.txtTacGia = txtTacGia;
    }

    public void setImvSach(int imvSach) {
        this.imvSach = imvSach;
    }

    public void setTxtGiaSach(double txtGiaSach) {
        this.txtGiaSach = txtGiaSach;
    }

    public String getTxtTenSach() {
        return txtTenSach;
    }

    public String getTxtTacGia() {
        return txtTacGia;
    }

    public int getImvSach() {
        return imvSach;
    }

    public double getTxtGiaSach() {
        return txtGiaSach;
    }

    public BookCart(String txtTenSach, String txtTacGia, int imvSach, double txtGiaSach) {
        this.txtTenSach = txtTenSach;
        this.txtTacGia = txtTacGia;
        this.imvSach = imvSach;
        this.txtGiaSach = txtGiaSach;
    }
}
