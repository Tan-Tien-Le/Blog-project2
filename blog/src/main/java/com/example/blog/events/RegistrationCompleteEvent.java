package com.example.blog.events;


import com.example.blog.entities.User;
import lombok.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


/**
 * @author Sampson Alfred
 */
@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private User user;
    private String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}