package com.cw.authoritymng.service;

import com.cw.authoritymng.model.AmUser;

import java.util.List;

public interface AmUserService {
    int addUser(AmUser amUser);

    List<AmUser> listAllUser(int pageNum, int pageSize);

}
