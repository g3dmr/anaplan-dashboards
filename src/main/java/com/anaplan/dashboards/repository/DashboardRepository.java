package com.anaplan.dashboards.repository;

import com.anaplan.dashboards.beans.DashboardBean;
import org.springframework.data.repository.CrudRepository;

public interface DashboardRepository extends CrudRepository<DashboardBean, Integer> {
}
