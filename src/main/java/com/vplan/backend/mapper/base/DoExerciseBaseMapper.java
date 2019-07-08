package mapper.base;

import java.util.List;

import com.vplan.backend.model.DoExerciseModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface DoExerciseBaseMapper {

    int insertDoExerciseModel(DoExerciseModel object);

    int updateDoExerciseModel(DoExerciseModel object);

    int update(DoExerciseModel.UpdateBuilder object);

    List<DoExerciseModel> queryDoExerciseModel(DoExerciseModel object);

    DoExerciseModel queryDoExerciseModelLimit1(DoExerciseModel object);

}