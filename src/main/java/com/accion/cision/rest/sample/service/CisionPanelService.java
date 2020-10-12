package com.accion.cision.rest.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.repository.CisionPanelRepository;

@Service
public class CisionPanelService {

    @Autowired
    private CisionPanelRepository panelRepository;

    public List<CisionPanelEntity> getAllPanels() {
        List<CisionPanelEntity> panelList = panelRepository.findAll();
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
        CisionPanelEntity entity = panelRepository
                .findUser(cisionPanelEntity.getEmail(), cisionPanelEntity.getPassword());
        if (entity != null) {
            return entity;
        } else {
            throw new UsernameNotFoundException(cisionPanelEntity.getEmail());
        }

    }

    /**
     * @param oldPassword
     * @param newPassword
     * @return
     */
    public String updatePassword(String oldPassword, String newPassword) {

        return "";
    }
}
