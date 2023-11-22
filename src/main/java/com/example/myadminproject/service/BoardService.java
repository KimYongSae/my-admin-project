package com.example.myadminproject.service;

import com.example.myadminproject.entity.BoardEntity;
import com.example.myadminproject.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

//    public List<BoardEntity> getBoardList() {
//        return boardRepository.findAll();
//    }

    public Page<BoardEntity> getBoardList(int page) {
        int pageSize = 10; // 페이지당 게시글 수를 10으로 고정
        Pageable pageable = PageRequest.of(page - 1, pageSize, Sort.by("postId").descending());

        return boardRepository.findAll(pageable);
    }

    public Optional<BoardEntity> findBoardById(int id) {
        return boardRepository.findById(id);
    }

    public BoardEntity saveBoard(BoardEntity board) {
        return boardRepository.save(board);
    }

    // 추가적인 메서드, 예를 들면 게시글 저장, 삭제, 단일 게시글 조회 등
}
