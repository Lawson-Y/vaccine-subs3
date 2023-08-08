package com.lawson.demograllvm2.config;

import com.lawson.demograllvm2.dto.UserDTO;
import com.lmax.disruptor.EventFactory;

public class YumiaoEventFactory implements EventFactory<UserDTO> {
    @Override
    public UserDTO newInstance() {
        return new UserDTO();
    }
}
