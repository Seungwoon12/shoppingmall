package com.siblings.shoppingmall.service;

import com.siblings.shoppingmall.entity.Board;

import java.util.List;
import java.util.Map;

public interface BoardService {

    public Long listCount() throws Exception;
    public List<Board> lists(Map<String, Integer> map) throws Exception;

}
