package oop.inherit9.re;

public abstract class Format {
	// 멤버 변수
	protected String filename;
	protected long filesize;

	public Format(String filename) {
		this.setFilename(filename);
	}

	public Format(String filenames, long filesize) {
		this.setFilename(filenames);
		this.setFilesize(filesize);
	}

	public String getFilename() {
		return filename;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}

	// 공통된.
	public abstract void execute();
}
