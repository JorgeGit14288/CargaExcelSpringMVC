/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tier3
 */
@Controller
@RequestMapping("/carga")
public class CargaArchivosController {

    //@RequestMapping("/carga")
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Home() {
        return new ModelAndView("/Carga/index");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView handleFormUpload(
            @RequestParam("file") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {

            String sql = "INSERT INTO imagen (nombre, tipo, tamano, pixel) VALUES(?, ?, ?, ?)";

            String nombre = file.getOriginalFilename();
            String tipo = file.getContentType();
            Long tamano = file.getSize();
            byte[] pixel = file.getBytes();

            // jdbc.update(sql, nombre, tipo, tamano, pixel);
        }
       return new ModelAndView("index");
    }

}
