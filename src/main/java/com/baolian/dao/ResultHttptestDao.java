package com.baolian.dao;

import com.baolian.entity.ResultHttptestEntity;
import com.baolian.entity.map.BrasHttptestResult;
import com.baolian.entity.map.CountyHttptestResult;
import com.baolian.entity.map.TopAliasResult;
import com.baolian.entity.map.WebHttpCountResult;

import java.util.List;
import java.util.Map;

/**
 * @author ${author}
 * @email ${email}
 * @date 2017-04-18 17:03:59
 */
public interface ResultHttptestDao extends BaseDao<ResultHttptestEntity> {

    List<CountyHttptestResult> queryCountyHttpList(Map<String, Object> map);

    /*门户感知*/
    List<WebHttpCountResult> queryWebList(Map<String, Object> map);

    List<BrasHttptestResult> queryBRASHttpList(Map<String, Object> map);

    List<TopAliasResult> queryTopAlias(Map<String, Object> map);

}
