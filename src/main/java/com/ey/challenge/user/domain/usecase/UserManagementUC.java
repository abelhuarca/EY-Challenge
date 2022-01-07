package com.ey.challenge.user.domain.usecase;

import com.ey.challenge.user.adapter.controller.model.in.UserRequest;
import com.ey.challenge.user.adapter.controller.model.out.AppUserDTO;

import java.util.List;

public interface UserManagementUC {

    AppUserDTO register(UserRequest userRequest);
    List<AppUserDTO> listAppUser();
}
