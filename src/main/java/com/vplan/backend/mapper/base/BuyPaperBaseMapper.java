package com.vplan.backend.mapper.base;

import java.util.List;

import com.vplan.backend.model.BuyPaperModel;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface BuyPaperBaseMapper {

    int insertBuyPaperModel(BuyPaperModel object);

    int updateBuyPaperModel(BuyPaperModel object);

    int update(BuyPaperModel.UpdateBuilder object);

    List<BuyPaperModel> queryBuyPaperModel(BuyPaperModel object);

    BuyPaperModel queryBuyPaperModelLimit1(BuyPaperModel object);

}