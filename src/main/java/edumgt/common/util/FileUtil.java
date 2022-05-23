package main.java.edumgt.common.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FileUtil {

	public String filePath = "";

	public List<FileVO> saveAllFilesBB(List<MultipartFile> upfiles) {
		String filePath = "/server/apache-tomcat-8.5.59/webapps/upload/images/";
		//String filePath = request.getSession().getServletContext().getRealPath("/upload/");
		List<FileVO> filelist = new ArrayList<FileVO>();

		for (MultipartFile uploadfile : upfiles ) {
			if (uploadfile.getSize() == 0) {
				continue;
			}

			String newName = uploadfile.getOriginalFilename();
			saveFile2(uploadfile, filePath + "/" , newName);

			FileVO filedo = new FileVO();
			filedo.setFilename(uploadfile.getOriginalFilename());
			filedo.setRealname(uploadfile.getOriginalFilename());
			filedo.setFilesize(uploadfile.getSize());
			filelist.add(filedo);
		}
		return filelist;
	}

	public List<FileVO> saveAllFileslogo(List<MultipartFile> upfiles) {
		String filePath = "/server/apache-tomcat-8.5.59/webapps/upload/images/";
		//String filePath = request.getSession().getServletContext().getRealPath("/upload/");
		List<FileVO> filelist = new ArrayList<FileVO>();

		for (MultipartFile uploadfile : upfiles ) {
			if (uploadfile.getSize() == 0) {
				continue;
			}
			String newName = uploadfile.getOriginalFilename();
			saveFile2(uploadfile, filePath + "/" , newName);

			FileVO filedo = new FileVO();
			filedo.setFilename(uploadfile.getOriginalFilename());
			filedo.setRealname(uploadfile.getOriginalFilename());
			filedo.setFilesize(uploadfile.getSize());
			filelist.add(filedo);
		}
		return filelist;
	}
	public List<FileVO> saveAllFiles(List<MultipartFile> upfiles) {
		String filePath = "/server/apache-tomcat-8.5.59/webapps/upload/images/";
		//String filePath = request.getSession().getServletContext().getRealPath("/upload/");
		List<FileVO> filelist = new ArrayList<FileVO>();

		for (MultipartFile uploadfile : upfiles ) {
			FileVO filedo = new FileVO();
			if (uploadfile.getSize() == 0) {
				filedo.setFilename("");
				filedo.setRealname("");
				filelist.add(filedo);
				continue;
			}

			String newName = uploadfile.getOriginalFilename();
			saveFile2(uploadfile, filePath + "/" , newName);

			filedo.setFilename(uploadfile.getOriginalFilename());
			filedo.setRealname(uploadfile.getOriginalFilename());
			filedo.setFilesize(uploadfile.getSize());
			filelist.add(filedo);
		}
		return filelist;
	}

	public String saveFile2(MultipartFile file, String basePath, String fileName){
		if (file == null || file.getName().equals("") || file.getSize() < 1) {
			return null;
		}

		makeBasePath(basePath);
		String serverFullPath = basePath + fileName;

		File file1 = new File(serverFullPath);
		try {
			file.transferTo(file1);
		} catch (IllegalStateException ex) {
			System.out.println("IllegalStateException: " + ex.toString());
		} catch (IOException ex) {
			System.out.println("IOException: " + ex.toString());
		}

		return serverFullPath;
	}

	public void makeBasePath(String path) {
		File dir = new File(path); 
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public String saveFile(MultipartFile file, String basePath, String fileName){
		if (file == null || file.getName().equals("") || file.getSize() < 1) {
			return null;
		}

		makeBasePath(basePath);
		String serverFullPath = basePath + fileName;

		File file1 = new File(serverFullPath);
		try {
			file.transferTo(file1);
		} catch (IllegalStateException ex) {
			System.out.println("IllegalStateException: " + ex.toString());
		} catch (IOException ex) {
			System.out.println("IOException: " + ex.toString());
		}

		return serverFullPath;
	}

	public String getNewName() {
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return ft.format(new Date()) + (int) (Math.random() * 10);
	}

	public String getFileExtension(String filename) {
		Integer mid = filename.lastIndexOf(".");
		return filename.substring(mid, filename.length());
	}

	public String getRealPath(String path, String filename) {
		return path + filename.substring(0,4) + "/";
	}

	public String saveImgFile(HttpServletRequest request, MultipartFile upfiles, String oldfilename) {

		filePath = request.getSession().getServletContext().getContext("/khadmin").getRealPath("").replace("khadmin",
				"") + "admin";

		System.out.println("*****************************************************");
		System.out.println(filePath);
		System.out.println("*****************************************************");

		String newName = "";

		if (!upfiles.isEmpty()) {
			newName = getNewName() + getFileExtension(upfiles.getOriginalFilename());
			saveFile2(upfiles, filePath + "/", newName);
		} else {
			newName = oldfilename;
		}

		return newName;
	}

	public String saveImgFile2(HttpServletRequest request, MultipartFile upfiles) {

		filePath = request.getSession().getServletContext().getContext("/khadmin").getRealPath("").replace("khadmin",
				"") + "admin";

		String newName = "";

		newName = getNewName() + getFileExtension(upfiles.getOriginalFilename());
		saveFile2(upfiles, filePath + "/", newName);

		return newName;
	}
}
