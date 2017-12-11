package com.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service()
public class NotificationServiceImpl  implements NotificationService{
    public static final String NOTIFY_MSG_SESSION_KEY = "siteNotificationMessages";

    @Autowired
   /* private HttpSession httpSession;
*/
    @Override
    public void addInfoMessage(String msg) {
       /* addNotificationMessage(NotificationMessageType.INFO, msg);
*/
    }

    @Override
    public void addErrorMessage(String msg) {

    }
}
