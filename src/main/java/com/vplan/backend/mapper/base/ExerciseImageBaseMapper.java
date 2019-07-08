package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.ExerciseImageModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ExerciseImageBaseMapper {

    int insertExerciseImageModel(ExerciseImageModel object);

    int updateExerciseImageModel(ExerciseImageModel object);

    int update(ExerciseImageModel.UpdateBuilder object);

    List<ExerciseImageModel> queryExerciseImageModel(ExerciseImageModel object);

    ExerciseImageModel queryExerciseImageModelLimit1(ExerciseImageModel object);

}