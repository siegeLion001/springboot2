package cn.cuihp.homework.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuihp.homework.dao.HomeworkDao;
import cn.cuihp.homework.domain.ExcellentHomeworkVo;
import cn.cuihp.homework.domain.HomeworkVo;
import cn.cuihp.homework.domain.InsertHomeWorkVo;
import cn.cuihp.homework.entity.HomeworkEntity;
import cn.cuihp.homework.service.HomeworkService;


@Service("homeworkService")
public class HomeworkServiceImpl implements HomeworkService {
    @Autowired
    private HomeworkDao homeworkDao;



    public HomeworkEntity queryObject(Integer id) {
        return homeworkDao.queryObject(id);
    }


    public HomeworkEntity queryContent(Integer homeworkId) {
        return homeworkDao.queryContent(homeworkId);
    }


    public List<HomeworkEntity> queryList(Map<String, Object> map) {
        return homeworkDao.queryList(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return homeworkDao.queryTotal(map);
    }


    public void save(HomeworkEntity homework) {
        homeworkDao.save(homework);
    }


    public void update(HomeworkEntity homework) {
        homeworkDao.update(homework);
    }


    public void delete(Integer id) {
        homeworkDao.delete(id);
    }


    public void deleteBatch(Integer[] ids) {
        homeworkDao.deleteBatch(ids);
    }


    public List<InsertHomeWorkVo> queryList4Map(Map<String, Object> params) {
        return homeworkDao.queryList4Map(params);
    }


    public int queryTotal4Map(Map<String, Object> params) {
        return homeworkDao.queryTotal4Map(params);
    }



}
