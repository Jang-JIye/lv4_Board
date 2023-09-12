package com.sparta.lv4_board.controller;


import com.sparta.lv4_board.dto.SignupRequestDto;
import com.sparta.lv4_board.dto.UserResponseDto;
import com.sparta.lv4_board.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    //회원 가입
    @PostMapping("/user/signup")
    public UserResponseDto signup(@RequestBody SignupRequestDto requestDto,HttpServletResponse httpServletResponse) {
        return userService.signup(requestDto);
    }

}
