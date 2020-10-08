package com.accion.cision.rest.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.repository.CisionPanelRepository;

@Service
public class CisionPanelService {

    @Autowired
    private CisionPanelRepository panelRepository;

    public List<CisionPanelEntity> getAllPanels() {
        List<CisionPanelEntity> panelList = panelRepository.findAll();
        System.out.println(panelList);

        if (panelList.size() > 0) {
            return panelList;
        } else {
            return new ArrayList<CisionPanelEntity>();
        }
    }


    /**
     * @param cisionPanelEntity
     * @return
     */
    public CisionPanelEntity loginUSer(CisionPanelEntity cisionPanelEntity) {
        return panelRepository.findUser
                (cisionPanelEntity.getEmail(), cisionPanelEntity.getPassword());
    }

    public String updatePassword(String oldPassword, String newPassword) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "";
    }
}
