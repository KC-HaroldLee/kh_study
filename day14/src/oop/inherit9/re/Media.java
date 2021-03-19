package oop.inherit9.re;

public abstract class Media extends Format {

	protected int duration;

	public Media(String filename) {
		super(filename);
	}

	public abstract void forward();

	public abstract void rewind();

}
