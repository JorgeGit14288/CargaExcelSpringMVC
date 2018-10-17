/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.utils.LeerExcel;
import com.utils.FileUploadService;
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
    public ModelAndView singleFileUpload(@RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes) {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return new ModelAndView("/Carga/index", "message", "Please select a file to upload");
        }
        try {

       
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get("C://temp//" + file.getOriginalFilename());
            Files.write(path, bytes);
            FileUploadService uploadService = new FileUploadService();
            uploadService.uploadFileData("C://temp//"+path.getFileName());

            redirectAttributes.addFlashAttribute("message", 
                        "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
        	redirectAttributes.addFlashAttribute("message", 
                    "Failure occured during upload '" + file.getOriginalFilename() + "'");
            e.printStackTrace();
        }

        return new ModelAndView("/Carga/index", "message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
    }
    /*
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView handleFormUpload(
            @RequestParam("file") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {

          
        }
        else{
            System.out.println("No se ha logrado la carga del archivo ");
        }
       return new ModelAndView("index");
    }
     */

}
