package com.example.myadminproject.controller;


import com.example.myadminproject.entity.BoardEntity;
import com.example.myadminproject.service.BoardService;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@ToString
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public String boardList(@RequestParam(defaultValue = "0") int page, Model model) {
        log.info("BoardController - boardList");

        Page<BoardEntity> boardList = boardService.getBoardList(page);
        model.addAttribute("boards", boardList.getContent());
        model.addAttribute("page", boardList);
        log.info("boardList = " + boardList);
        return "board/list";
    }

    @GetMapping("/write")
    public String boardWrite(Model model) {
        log.info("BoardController - boardWrite");

        return "board/write"; // 게시판 목록을 보여줄 뷰 이름
    }
    @GetMapping("/detail")
    public String boardDetail(Model model) {
        log.info("BoardController - boardDetail(temp)");

        return "board/detail"; // 게시판 목록을 보여줄 뷰 이름
    }

    // 추가 기능을 위한 메서드들을 여기에 구현할 수 있습니다.
}
