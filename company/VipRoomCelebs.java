package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class VipRoomCelebs extends VIPRoom {

    private @Getter @Setter float m_jaccuzi;

    public void swimInTheJaccuzi () {
        System.out.println(String.format("swimming in jaccuzi size = %f",m_jaccuzi));
    }
}
