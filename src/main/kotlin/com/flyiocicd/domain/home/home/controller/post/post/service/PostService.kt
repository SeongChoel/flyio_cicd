package com.flyiocicd.domain.home.home.controller.post.post.service

import com.flyiocicd.domain.home.home.controller.post.post.entity.Post
import com.flyiocicd.domain.home.home.controller.post.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun count() = postRepository.count()

    fun write(title: String, content: String): Post {
        return postRepository.save(Post(title = title, content = content))
    }

    fun findAll() = postRepository.findAll()
}