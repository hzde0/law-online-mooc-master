package com.hzde.eduservice.mapper;

import com.hzde.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzde.eduservice.entity.frontvo.CourseWebVo;
import com.hzde.eduservice.entity.vo.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author hz
 * @since 2023-05-15
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getPublishCourseInfo(String id);

    CourseWebVo getBaseCourseInfo(String courseId);
}
