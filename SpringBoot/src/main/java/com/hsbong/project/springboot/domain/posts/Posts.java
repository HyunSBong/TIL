package com.hsbong.project.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter // 클래스 내 모든 필드의 Getter 메소드를 자동 생성
@NoArgsConstructor // 기본 생성자 추가
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts { // 실제 DB의 테이블과 매칭될 클래스 (Entity Class)

    @Id // 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 Column을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 Column이 됨
    // 여기서는 기본값 외에 추가로 변경이 필요한 옵션을 위해 선언되었음
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성, 여기처럼 생성자 위에 선언시 생성자에 포함된 필드만 빌더에 포함됨
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
