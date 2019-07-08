package com.vplan.backend.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.vplan.backend.model.UserModel;
/**
*  @author author
*/
public interface UserBaseMapper {

    int insertUserModel(UserModel object);

    int updateUserModel(UserModel object);

    int update(UserModel.UpdateBuilder object);

    List<UserModel> queryUserModel(UserModel object);

    UserModel queryUserModelLimit1(UserModel object);

}