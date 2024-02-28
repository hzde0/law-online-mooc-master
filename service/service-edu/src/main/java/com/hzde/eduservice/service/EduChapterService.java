package com.hzde.eduservice.service;

import com.hzde.eduservice.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hzde.eduservice.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author chenle
 * @since 2023-05-15
 */
public interface EduChapterService extends IService<EduChapter> {

    List<ChapterVo> getChapterVideoByCourseId(String courseId);

    boolean deleteChapter(String chapterId);

    void removeChapterByCourseId(String courseId);
}
