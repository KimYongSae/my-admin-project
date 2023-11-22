package com.example.myadminproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@DynamicInsert
@Table(name = "board")
public class BoardEntity {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "title")
    private String title;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "view_count")
    private int view_count;

    @Column(name = "content")
    private String content;



}
