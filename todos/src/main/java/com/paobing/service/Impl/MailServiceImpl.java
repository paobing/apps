package com.paobing.service.Impl;

import com.paobing.service.MailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
        // 简易邮件
        //SimpleMailMessage message;
        //message = new SimpleMailMessage();
        //message.setFrom("paobing_guo@163.com");
        //message.setTo("xiangni_zhao@126.com");
        //message.setSubject("Hello～");
        //message.setText("你好啊～");

        // 复杂邮件 Text支持html
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom("paobing_guo@163.com");
            helper.setTo("xiangni_zhao@126.com");
            helper.setSubject("Hello～");
            helper.setText("你好啊～", true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


        javaMailSender.send(message);
        System.out.println("Send Mail...");
    }
}
