package com.flyiocicd.domain.home.home.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.net.InetAddress

@Controller
class HomeController {

    @GetMapping
    @ResponseBody
    fun main(): String {
        val localhost = InetAddress.getLocalHost()
        val hostname = localhost.hostName

        return "홈 ,hostname: $hostname"
    }
}