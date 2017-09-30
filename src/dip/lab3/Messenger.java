package dip.lab3;

/**
 *
 * @author Cainebourne
 */
public class Messenger {
        private Reader reader;
	private Writer writer;

	public Messenger( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
         if(reader == null){
            throw new IllegalArgumentException("reader is required");
        }
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
         if(writer == null){
            throw new IllegalArgumentException("writer is required");
        }
        this.writer = writer;
    }
	
	public final void showMessage() {
            String line = reader.readln();
            writer.writeln( line );
	}
}
