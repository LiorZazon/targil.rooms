package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class StandartRoom extends Room {

    private @Getter @Setter int m_small_vault_code;

    public void reetVaultCode () {
        m_small_vault_code = 1234;
    }
}
