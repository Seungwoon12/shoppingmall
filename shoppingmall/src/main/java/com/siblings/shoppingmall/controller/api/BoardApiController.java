package com.siblings.shoppingmall.controller.api;

import com.siblings.shoppingmall.entity.Board;
import com.siblings.shoppingmall.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
@RequestMapping("/board")
public class BoardApiController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final BoardService boardService;

    public BoardApiController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/totalCount")
    public Long listCount() throws Exception {
        return boardService.listCount();

    }

    @GetMapping("/list/{pageNum}")
    public List<Board> list(@PathVariable int pageNum) throws Exception {
         int listSize = 10;
         int start = ((pageNum - 1) * listSize) + 1;
         int end = start + listSize - 1;

        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", start);
        map.put("endRow", end);

        return boardService.lists(map);

    }
}
