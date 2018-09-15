package cn.cuihp.homework.dao;

import java.util.List;
import java.util.Map;

import cn.cuihp.homework.domain.ExcellentHomeworkVo;
import cn.cuihp.homework.domain.HomeworkVo;
import cn.cuihp.homework.domain.InsertHomeWorkVo;
import cn.cuihp.homework.entity.HomeworkEntity;


/**
 * 作业表
 *
 * @author m.f
 * @email miaof@lanhaihui.net
 * @date 2018-05-18 09:44:45
 */
public interface HomeworkDao  {
    void save(HomeworkEntity t);

    void save(Map<String, Object> map);

    void saveBatch(List<HomeworkEntity> list);

    int update(HomeworkEntity t);

    int update(Map<String, Object> map);

    int delete(Object id);

    int delete(Map<String, Object> map);

    int deleteBatch(Object[] id);

    HomeworkEntity queryObject(Object id);

    /**
     * 制造冲突   idea提交
     * 页面确认
     * @param map
     * @return
     */
    List<HomeworkEntity> queryList(Map<String, Object> map);

    List<HomeworkEntity> queryList(Object id);

    int queryTotal(Map<String, Object> map);

    int queryTotal();
    List<InsertHomeWorkVo> queryList4Map(Map<String, Object> params);

    HomeworkEntity queryContent(Integer homeworkId);

    int queryTotal4Map(Map<String, Object> params);

    Map<String, Object> queryComplete4Tch(Map<String, Object> params);

    /*
     * @Description: 根据类型统计作业数量
     * @Name: queryHomeworkCount4Type
     * @Params: [params]
     * @return: java.util.List<java.util.Map>
     * @Author: cuihp
     * @Date: 2018/6/8
     */
    List<Map> queryHomeworkCount4Type(Map<String, Object> params);

    List<Map<String, Object>> queryStuSubmitCount(Map<String, Object> params);

    List<Map> queryStuReport2Map(Map<String, Object> params);

    HomeworkVo queryObjectVo(Integer homeworkId);

    /**
     * 计算总分
     *主干页面提交
     *制造冲突
     *	
     *	
     * @return
     */
    Double fullScore(Integer homeworkId);

    /**
     * 优秀作业
     */

    List<ExcellentHomeworkVo> excellentHomework(Map<String, Object> params);

    int excellentHomeworkTotal(Map<String, Object> params);

	List<HomeworkEntity> draftsList(Map<String, Object> params);


}
