package com.baolian.service;

import com.baolian.entity.ResultGametestEntity;
import com.baolian.entity.map.BaseResult;
import com.baolian.entity.map.BrasGametestResult;
import com.baolian.entity.map.CountyGametestResult;
import com.baolian.entity.map.WebGameCountResult;

import java.util.List;
import java.util.Map;

/**
 * @author ${author}
 * @email ${email}
 * @date 2017-04-18 17:03:59
 */
public interface ResultGametestService {

    ResultGametestEntity queryObject(Integer id);

    List<ResultGametestEntity> queryList(Map<String, Object> map);

    List<WebGameCountResult> queryWebList(Map<String, Object> map);

    List<CountyGametestResult> queryCountyGameList(Map<String, Object> map);

    List<BrasGametestResult> queryBRASGameList(Map<String, Object> map);

    List<BaseResult> queryGameMonthList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(ResultGametestEntity resultGametest);

    void update(ResultGametestEntity resultGametest);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
