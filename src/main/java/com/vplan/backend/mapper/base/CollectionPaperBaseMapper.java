package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.CollectionPaperModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface CollectionPaperBaseMapper {

    int insertCollectionPaperModel(CollectionPaperModel object);

    int updateCollectionPaperModel(CollectionPaperModel object);

    int update(CollectionPaperModel.UpdateBuilder object);

    List<CollectionPaperModel> queryCollectionPaperModel(CollectionPaperModel object);

    CollectionPaperModel queryCollectionPaperModelLimit1(CollectionPaperModel object);

}