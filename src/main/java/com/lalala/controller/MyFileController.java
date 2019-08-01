package com.lalala.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class MyFileController {

	@RequestMapping("/file")
	@ResponseBody
	public String upload(MultipartFile myFile, HttpServletRequest req) throws IllegalStateException, IOException {
		String path = req.getServletContext().getRealPath("");
		File dir = new File( "H:/Test/upload");
		dir.mkdir();
		myFile.transferTo(new File("H:/Test/upload/"+myFile.getOriginalFilename()));
		return "success";

	}

}
