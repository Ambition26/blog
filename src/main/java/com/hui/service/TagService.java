package com.hui.service;

import com.hui.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hui
 * @date 2020/9/2 10:48
 * 概要：
 */
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long Id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);
}
