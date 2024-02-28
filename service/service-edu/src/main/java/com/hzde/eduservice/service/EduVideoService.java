package com.hzde.eduservice.service;

import com.hzde.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author chenle
 * @since 2023-05-15
 */
public interface EduVideoService extends IService<EduVideo> {

    void removeVideoByCourseId(String courseId);
}
