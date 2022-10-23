package com.example.model;

public class TacGia {
    private int tacgiaImage;
    private String tacgiaView;

    public void setTacgiaImage(int tacgiaImage) {
        this.tacgiaImage = tacgiaImage;
    }

    public void setTacgiaView(String tacgiaView) {
        this.tacgiaView = tacgiaView;
    }

    public int getTacgiaImage() {
        return tacgiaImage;
    }

    public String getTacgiaView() {
        return tacgiaView;
    }

    public TacGia(int tacgiaImage, String tacgiaView) {
        this.tacgiaImage = tacgiaImage;
        this.tacgiaView = tacgiaView;
    }
}
