package com.anaplan.dashboards.services;

import com.anaplan.dashboards.beans.DashboardBean;
import com.anaplan.dashboards.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class DashboardService {

    @Autowired
    private DashboardRepository repository;

    public @ResponseBody Iterable<DashboardBean> getDashboards() {

        return repository.findAll();
    }

}
