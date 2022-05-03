package JavaUp7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class JavaUP_File {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter kp5_fw = new FileWriter("C:\\Users\\Sihyeon\\Desktop\\file.txt",true);
		BufferedWriter kp5_bw = new BufferedWriter(kp5_fw);
		StringBuffer kp5_sf = new StringBuffer(); 
		
		BufferedReader kp5_br = new BufferedReader(new InputStreamReader(System.in));
		String kp5_str = "";
		while(!(kp5_str = kp5_br.readLine()).startsWith("s"))
		kp5_sf.append(kp5_str + "\n");
		kp5_br.close();
		kp5_fw.write(kp5_sf.toString());
		kp5_fw.flush();
		kp5_fw.close();
		System.out.println("저장이 완료되었습니다.");
		
	}
}
