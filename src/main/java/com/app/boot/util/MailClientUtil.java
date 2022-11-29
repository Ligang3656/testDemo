package com.app.boot.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


/**
 * @description
 * @author: ligang
 * @date: 2022/11/29/ 18:42
 **/

@Component
public class MailClientUtil {
    //    定义日志输出对象
    private static final Logger logger = LoggerFactory.getLogger(MailClientUtil.class);
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private String from;

    public void sendMail(String to,String subject,String content) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper help = new MimeMessageHelper(mimeMessage);
            help.setFrom(from);
            help.setTo(to);
            help.setSubject(subject);
            help.setText(content,true);
            javaMailSender.send(help.getMimeMessage());
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.error("发送邮件失败！"+e.getMessage());
        }
    }
}
