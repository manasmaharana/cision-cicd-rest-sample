package com.accion.cision.rest.sample.model;

import java.util.ArrayList;
import java.util.List;

public class CisionPanels {

    private List<CisionPanel> cisionPanelList;

    public List<CisionPanel> getCisionPanelList() {
        if (cisionPanelList == null) {
            cisionPanelList = new ArrayList<>();
        }
        return cisionPanelList;
    }

    public void setCisionPanelList(List<CisionPanel> cisionPanelList) {
        this.cisionPanelList = cisionPanelList;
    }
}
