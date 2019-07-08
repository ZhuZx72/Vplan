package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.DoPaperModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface DoPaperBaseMapper {

    int insertDoPaperModel(DoPaperModel object);

    int updateDoPaperModel(DoPaperModel object);

    int update(DoPaperModel.UpdateBuilder object);

    List<DoPaperModel> queryDoPaperModel(DoPaperModel object);

    DoPaperModel queryDoPaperModelLimit1(DoPaperModel object);

}