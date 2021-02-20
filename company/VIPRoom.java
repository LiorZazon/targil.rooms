package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class VIPRoom extends Room {

    private @Getter @Setter float m_mini_bar_size;

    public void party() {
        System.out.println(String.format("party in VIP room drinking from mini bar %f",
                m_mini_bar_size));
    }

}
