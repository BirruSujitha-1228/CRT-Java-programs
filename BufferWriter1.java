import java.io.File;
class BufferWriter1{
	public static void main(String[] args){
		BufferedWriter.bw=new BufferedWriter(new FileWriter("data.txt"));
		bw.write("First Line");
		bw.newLine();
		bw.Write("second Line");
		bw.Close();
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}