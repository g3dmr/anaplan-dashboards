package com.anaplan.dashboards.controller;

import com.anaplan.dashboards.beans.DashboardBean;
import com.anaplan.dashboards.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dashboards")
public class DashborardController {

    @Autowired
    private DashboardService service;

    @GetMapping
    public @ResponseBody Iterable<DashboardBean> getDashboards() {

        return service.getDashboards();
    }

}
