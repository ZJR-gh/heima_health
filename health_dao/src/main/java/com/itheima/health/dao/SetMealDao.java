package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.SetMeal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SetMealDao {
    /**
     * 添加套餐
     * @param setMeal
     */
    void add(SetMeal setMeal);

    /**
     * 添加套餐与检查组的关系
     * @param setMealId
     * @param checkGroupId
     */
    void addSetMealCheckGroup(@Param("setMealId") Integer setMealId, @Param("checkGroupId") Integer checkGroupId);

    /**
     * 分页条件查询
     * @param queryString
     * @return
     */
    Page<SetMeal> findByCondition(String queryString);

    /**
     * 通过id查询套餐信息
     * @param id
     * @return
     */
    SetMeal findById(int id);

    /**
     *通过id查询选中的检查组ids
     * @param id
     * @return
     */
    List<Integer> findCheckGroupIdsBySetMealId(int id);

    /**
     * 更新套餐信息
     * @param setMeal
     */
    void update(SetMeal setMeal);

    /**
     * 删除旧关系
     * @param id
     */
    void deleteSetMealCheckGroup(Integer id);

    /**
     * 通过套餐的id查询使用了这个套餐的订单个数
     * @param id
     * @return
     */
    int findOrderCountBySetMealId(int id);

    /**
     * 通过id删除套餐信息
     * @param id
     */
    void deleteById(int id);
}
