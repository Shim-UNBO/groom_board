package com.example.demo.board.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="board") //사용하지 않으면 클래스 이름이 테이블 이름이 됨
@Getter //lombok getter
@Setter //lombok setter
public class Board{
//    @Id //기본키를 의미. 반드시 기본키를 가져야함.
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    @Column(unique = true, length=10) //유일하고 최대 길이가 10.
    private String nickName;
    @Column(name="content") // 게시글 내용
    private String content;
    @Column(name="reg_time") // 등록 시간, 컬럼 이름은 SQL 규칙을 따름
    private LocalDateTime regTime; // 자바 타임(LocalDateTime) 사용

}
