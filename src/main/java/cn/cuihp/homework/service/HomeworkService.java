package cn.cuihp.homework.service;

import java.util.List;
import java.util.Map;

import cn.cuihp.homework.domain.InsertHomeWorkVo;
import cn.cuihp.homework.entity.HomeworkEntity;


/**
 * 作业表
 *
 * @author m.f
 * @email miaof@lanhaihui.net
 * @date 2018-05-18 09:44:45
 */
public interface HomeworkService {
    HomeworkEntity queryObject(Integer id);

    List<HomeworkEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HomeworkEntity homework);

    void update(HomeworkEntity homework);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);

    List<InsertHomeWorkVo> queryList4Map(Map<String, Object> params);

    HomeworkEntity queryContent(Integer homeworkId);

    int queryTotal4Map(Map<String, Object> params);





}
