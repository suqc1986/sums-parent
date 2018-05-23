package com.suqc.api;

import com.suqc.pojo.DictCity;

import java.util.List;
import java.util.Map;

public interface DictCityService {

    public List<DictCity> getAll();

    public List<Map<String,Long>> getDictMap();
}
