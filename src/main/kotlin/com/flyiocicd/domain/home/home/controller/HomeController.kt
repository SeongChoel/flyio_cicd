package com.flyiocicd.domain.home.home.controller

import com.flyiocicd.global.extensions.logger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.net.InetAddress

@Controller
class HomeController {

    private val logger = logger()

    @GetMapping
    @ResponseBody
    fun main(): String {
        val localhost = InetAddress.getLocalHost()
        val hostname = localhost.hostName

        println(hostname)
        logger.info("hostname: $hostname")
        logger.debug("hostname: $hostname")

        return "홈 ,hostname: $hostname"
    }
}