package vu.mif.myBatis.DAO;

import java.util.List;

import org.mybatis.cdi.Mapper;
import vu.mif.myBatis.model.ArmyunitMission;
@Mapper
public interface ArmyunitMissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARMYUNIT_MISSION
     *
     * @mbg.generated Mon Apr 20 02:01:13 EEST 2020
     */
    int insert(ArmyunitMission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARMYUNIT_MISSION
     *
     * @mbg.generated Mon Apr 20 02:01:13 EEST 2020
     */
    List<ArmyunitMission> selectAll();
}