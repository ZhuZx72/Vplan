package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.CollectionExerciseModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface CollectionExerciseBaseMapper {

    int insertCollectionExerciseModel(CollectionExerciseModel object);

    int updateCollectionExerciseModel(CollectionExerciseModel object);

    int update(CollectionExerciseModel.UpdateBuilder object);

    List<CollectionExerciseModel> queryCollectionExerciseModel(CollectionExerciseModel object);

    CollectionExerciseModel queryCollectionExerciseModelLimit1(CollectionExerciseModel object);

}