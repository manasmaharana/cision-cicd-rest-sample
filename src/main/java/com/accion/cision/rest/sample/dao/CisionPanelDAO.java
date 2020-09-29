package com.accion.cision.rest.sample.dao;

import com.accion.cision.rest.sample.model.CisionPanel;
import com.accion.cision.rest.sample.model.CisionPanels;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class CisionPanelDAO {

    // Initiate a static list for the testing of this demo
    private static CisionPanels cisionPanelList = new CisionPanels();

    static {
        cisionPanelList.getCisionPanelList().add(new CisionPanel("Manas Maharana", "Java", Arrays.asList("Level1", "Level2"), "NA"));
        cisionPanelList.getCisionPanelList().add(new CisionPanel("Amol Tode", "BA", Arrays.asList("Level1", "Level2", "Managerial"), "NA"));
        cisionPanelList.getCisionPanelList().add(new CisionPanel("Vinayak B M", "Dot Net", Arrays.asList("Level1", "Level2"), "NA"));
        cisionPanelList.getCisionPanelList().add(new CisionPanel("Ravikanth Badam", "QA", Arrays.asList("Level1", "Level2"), "NA"));
    }

    public CisionPanels getAllCisionPanels() {
        return cisionPanelList;
    }

    public void addCisionPanel(CisionPanel cisionPanel) {
        cisionPanelList.getCisionPanelList().add(cisionPanel);
    }
}
