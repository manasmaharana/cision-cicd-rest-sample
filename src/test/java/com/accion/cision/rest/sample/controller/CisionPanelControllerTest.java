package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;
import com.accion.cision.rest.sample.repository.CisionPanelRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

public class CisionPanelControllerTest extends AbstarctControllerTest {

    private final String baseUrl = "/cision";
    @MockBean
    CisionPanelRepository cisionPanelRepository;

    @Override
    @BeforeEach
    protected void setUp() {
        super.setUp();
    }

    @Test
    public void getCisionPanels() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(baseUrl + "/panels")
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        List<CisionPanelEntity> panelList = super.mapFromJson(content, List.class);
        Assertions.assertTrue(panelList != null);
    }

    @Test
    public void addCisionPanel() throws Exception {
        CisionPanelEntity cisionPanelEntity = new CisionPanelEntity();
        cisionPanelEntity.setId(100L);
        cisionPanelEntity.setFullName("Test Test");

        String inputJson = super.mapToJson(cisionPanelEntity);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(baseUrl + "/addPanel")
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        Assertions.assertEquals(content, "");
    }
}
