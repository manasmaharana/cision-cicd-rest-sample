package com.accion.cision.rest.sample.model;

import java.util.List;

public class CisionPanel {

    // Default constructor
    public CisionPanel() {
    }

    // Parameterized constructor to setup all data
    public CisionPanel(String panelName, String techStream, List<String> levels, String detail) {
        super();
        this.panelName = panelName;
        this.techStream = techStream;
        this.levels = levels;
        this.detail = detail;
    }

    private String panelName;
    private String techStream;
    private List<String> levels;
    private String detail;

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public String getTechStream() {
        return techStream;
    }

    public void setTechStream(String techStream) {
        this.techStream = techStream;
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "CisionPanel{" +
                "panelName='" + panelName + '\'' +
                ", techStream='" + techStream + '\'' +
                ", levels=" + levels +
                ", detail='" + detail + '\'' +
                '}';
    }
}
