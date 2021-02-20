package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Room {

    private @Getter @Setter boolean m_isClean;
    private @Getter @Setter int m_number;
    private @Getter @Setter double m_size;
    private @Getter @Setter int m_floor;
    private @Getter @Setter boolean m_is_smoking;
    private @Getter @Setter boolean m_isFree;

    public void cleanRoom () {
        System.out.println(String.format("cleaning room number %d", m_number));
        m_isClean = true;
    }
    public void evacuateRoom () {
        System.out.println(String.format("evacuate room number %d", m_number));
        m_isFree = true;
    }
}
