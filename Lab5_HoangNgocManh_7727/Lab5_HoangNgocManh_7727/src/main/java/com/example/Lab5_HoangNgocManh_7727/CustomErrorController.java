package com.example.Lab5_HoangNgocManh_7727;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@RequestMapping("/error")
public class CustomErrorController implements ErrorController {

    @GetMapping
    public String handleErrorGet(HttpServletRequest request) {
        return getErrorPath(request);
    }

    @PostMapping
    public String handleErrorPost(HttpServletRequest request) {
        return getErrorPath(request);
    }

    private String getErrorPath(HttpServletRequest request) {
        return Optional.ofNullable(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE))
                .map(status -> Integer.parseInt(status.toString()))
                .filter(status -> status == 404)
                .map(status -> "error/404")
                .orElse("error/default");
    }
}
