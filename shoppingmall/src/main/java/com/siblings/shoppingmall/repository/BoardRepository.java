package com.siblings.shoppingmall.repository;

import com.siblings.shoppingmall.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BoardRepository {

    public Long totalCount() throws Exception;
    public List<Board> lists(Map<String, Integer> map) throws Exception;
}
