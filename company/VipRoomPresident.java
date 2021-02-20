package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class VipRoomPresident extends VIPRoom {


    private @Setter @Getter int m_guards;

    public void addGuard () {
        m_guards++;
    }

    public float getMiniBarSize(){
        return getM_mini_bar_size();
    }


}
