import java.io.File;
class ReadingWriterFile{
	public static void main(String[] args){
		FileWriter writer=new.FileWriter("output.txt");
		Writer.writer("hello,java Filewrite!");
		writer.close();
		FileReader.reader= new.FileReader("output.txt")
		int ch;
		while((ch=reader.read.())!=-1){
			System.out.println((char)ch);
		}
		reader.close();
	}
}
		