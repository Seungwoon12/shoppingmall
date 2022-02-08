package com.siblings.shoppingmall.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Long boardNo;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
}
