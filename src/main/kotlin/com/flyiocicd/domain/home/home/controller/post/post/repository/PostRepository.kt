package com.flyiocicd.domain.home.home.controller.post.post.repository

import com.flyiocicd.domain.home.home.controller.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long>