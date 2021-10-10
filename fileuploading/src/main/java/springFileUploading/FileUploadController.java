package springFileUploading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/")
public class FileUploadController {

	@RequestMapping("/upload")
	public String showUploadForm() {
		return "fileForm";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("image") CommonsMultipartFile file, HttpSession session, Model model) throws IOException {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize() + "  Bytes");
		System.out.println(file.getContentType());
		byte[] data = file.getBytes();
		// We have to save this file in the server.
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "assets"
				+ File.separator + file.getOriginalFilename();
		System.out.println(path);
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		model.addAttribute("filename", file.getOriginalFilename());
		System.out.println("File uploaded");
		return "fileSuccess";
	}
}
