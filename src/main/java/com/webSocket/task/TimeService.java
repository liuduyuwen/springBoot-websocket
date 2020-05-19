package com.webSocket.task;


import com.webSocket.test.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 授时服务
 *
 * 暂时设定授时服务为3个
 */
@Component
@EnableScheduling
public class TimeService {


    @Autowired
    private WebSocket webSocket;

    @Scheduled(cron = "0/5 * * * * ?}")
    void secondTimeService(){
        System.out.println("定时器");
        try {
            webSocket.sendInfo("你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
