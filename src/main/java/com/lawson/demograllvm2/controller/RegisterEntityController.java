package com.lawson.demograllvm2.controller;

import com.lawson.demograllvm2.services.YuemiaoService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Lawson
 * @since 2023-08-02
 */
@RestController
@RequestMapping("/register")
public class RegisterEntityController {

    @Autowired
    private YuemiaoService yuemiaoService;

    @GetMapping(path = "/{proxyId}/{uuid}")
    public void wxLoginQr(HttpServletResponse res, @PathVariable(name = "uuid") String uuid) throws IOException {
        String wxQr = this.yuemiaoService.getWxQr(uuid);
        res.sendRedirect(wxQr);
    }

}
