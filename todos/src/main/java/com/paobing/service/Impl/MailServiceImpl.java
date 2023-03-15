package com.paobing.service.Impl;

import com.paobing.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    // 发送人
    // 接收人
    // 标题
    // 正文

    @Override
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("paobing_guo@163.com");
        message.setTo("xiangni_zhao@126.com");
        message.setSubject("Hello～");
        message.setText("你好啊～");
        javaMailSender.send(message);
        System.out.println("Send Mail...");
    }
}
