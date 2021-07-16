package br.ifsp.edu.heigostosospring.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();
        if (uri.contains("login") || uri.contains("efetuaLogin") || uri.endsWith("registrar") || uri.contains("resources") || uri.contains("webjars") || uri.contains("bootstrap")
                || uri.contains("poppers") || uri.contains("css") || uri.contains("js") || uri.contains("img")) {
            return true;
        }

        if (request.getSession().getAttribute("userLogged") != null) {
            return true;
        }
            response.sendRedirect("/usuario/login");
            return false;
    }

}
