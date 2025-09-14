package com.flyiocicd.global.initData

import com.flyiocicd.domain.home.home.controller.post.post.service.PostService
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy

@Configuration
class BaseInitData(
    private val postService: PostService
) {
    @Autowired
    @Lazy
    private lateinit var self: BaseInitData

    @Bean
    fun baseInitDataApplicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            self.work1()
        }
    }

    @Transactional
    fun work1() {
        if ( postService.count() > 0 ) return

        postService.write("제목 1", "내용 1")
        postService.write("제목 2", "내용 2")
    }
}