package com.sparta.lv4_board.repository;

import com.sparta.lv4_board.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    void delete(Comment comment);
}
