package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.GetCoinModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface GetCoinBaseMapper {

    int insertGetCoinModel(GetCoinModel object);

    int updateGetCoinModel(GetCoinModel object);

    int update(GetCoinModel.UpdateBuilder object);

    List<GetCoinModel> queryGetCoinModel(GetCoinModel object);

    GetCoinModel queryGetCoinModelLimit1(GetCoinModel object);

}