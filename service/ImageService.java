package service;

import java.io.File;

public class ImageService {

	private ImageService() {

	}

	private static ImageService instance = new ImageService();

	public static ImageService getInstance() {
		return instance;
	}

	public String[] getImageList(String path) {
		// jpg파일만 목록으로 뽑기.
		File dir = new File(path);
		// String[] files = dir.list();
		//어차피 메소드 하나라서 functional interface이므로 람다식으로 대체. 
		//String[] files = dir.list((File fdir, String name) -> name.endsWith(".jpg"));
		String[] files = dir.list((fdir, name) -> name.endsWith(".jpg"));
		return files;
	}
}
