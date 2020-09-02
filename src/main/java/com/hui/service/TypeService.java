package com.hui.service;

import com.hui.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hui
 * @date 2020/9/1 20:35
 * 概要：
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long Id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id, Type type);

    void deleteType(Long id);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);
}
