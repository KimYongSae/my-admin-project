package com.example.myadminproject.repository;

import com.example.myadminproject.entity.BoardEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    Page<BoardEntity> findAll(Pageable pageable);
}
