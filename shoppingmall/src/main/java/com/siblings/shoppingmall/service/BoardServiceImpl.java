package com.siblings.shoppingmall.service;

import com.siblings.shoppingmall.entity.Board;
import com.siblings.shoppingmall.entity.Member;
import com.siblings.shoppingmall.repository.BoardRepository;
import com.siblings.shoppingmall.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;


    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Long listCount() throws Exception {
        return boardRepository.totalCount();
    }

    @Override
    public List<Board> lists(Map<String, Integer> map) throws Exception {
        return boardRepository.lists(map);
    }
}
