package com.yanghz.mechant.mapper;

import com.yanghz.mechant.model.Mechant;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yanghangzheng
 * @date 2019/7/5 9:03
 */

@Mapper
public interface MechantMapper {
    void insertMechant(Mechant mechant);

    void updateMechant(Mechant mechant);

    Mechant findMechantById(int id);

    void updateMechantStatus(Mechant mechant);

    void updateMechantSoldout(Mechant mechant);
}
