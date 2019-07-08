package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.ExerciseModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ExerciseBaseMapper {

    int insertExerciseModel(ExerciseModel object);

    int updateExerciseModel(ExerciseModel object);

    int update(ExerciseModel.UpdateBuilder object);

    List<ExerciseModel> queryExerciseModel(ExerciseModel object);

    ExerciseModel queryExerciseModelLimit1(ExerciseModel object);

}