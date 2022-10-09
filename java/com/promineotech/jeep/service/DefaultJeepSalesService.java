package com.promineotech.jeep.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.dao.JeepSalesDao;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

@Service
@RestController
@Slf4j
public class DefaultJeepSalesService  implements JeepSalesService {

@Autowired
private JeepSalesDao jeepSalesDao;


  //@Override
@SuppressWarnings("rawtypes")
public List<Jeep> fetchJeeps(JeepModel model,String trim) {
Log.info("The fetchjeeps method was called with mode ={} and trim = {}",

    model, trim);
List<Jeep> jeeps = jeepSalesDao.fetchJeeps(model, trim);

return jeeps;

// JeepSalesDao.fetchJeeps(model, trim);
}
  
}
