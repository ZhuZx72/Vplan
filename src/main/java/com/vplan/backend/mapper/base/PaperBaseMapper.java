package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.PaperModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface PaperBaseMapper {

    int insertPaperModel(PaperModel object);

    int updatePaperModel(PaperModel object);

    int update(PaperModel.UpdateBuilder object);

    List<PaperModel> queryPaperModel(PaperModel object);

    PaperModel queryPaperModelLimit1(PaperModel object);

}