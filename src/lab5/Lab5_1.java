package lab5;

import java.io.*;
import java.util.Scanner;

public class Lab5_1 {
    static BufferedWriter wri = null;
    static BufferedReader read = null;
    static InputStreamReader in = null;
    static FileInputStream fin = null;
    static String filename;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        {
            System.out.println("======================\n학번: 20150000\n이름: 컴돌이\n======================");
            File f;			//파일 변수 생성
            if (args.length == 0) {
                f = createFile(null);
            } else {
                f = createFile(args[0]);
            }

            InputStreamReader in = new InputStreamReader(System.in);

            try {
                File file = new File(filename); // 파일 생성을 프로젝터 폴더내에 생성합니다.
                if (!file.exists()) { 			// 파일이 존재하지 않는다면 새 파일을 만듭니다.
                    file.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.close(); //닫습니다.

                wri = new BufferedWriter(new FileWriter(filename, true));
                System.out.println("입력할 내용를 적어주세요.");

                int redC;
                char[] cbuf = new char[100];		//한글 입력을 위한 배열
                while ((redC = in.read(cbuf)) != -1) {		//힌글 입력을 받습니다.
                    String data = new String(cbuf, 0, redC);

                    wri.write(data);
                    wri.close();			//스트림을 반드시 닫아줘야 합니다.
                }
            } catch (IOException e) {

            }

            try {			//생성된 파일을 읽는 부분 입니다.
                read = new BufferedReader(new FileReader(filename));		//파일을 불러옵니다.
                FileInputStream fff = new FileInputStream(filename);
                Reader reader = new InputStreamReader(fff);
                BufferedReader rr = new BufferedReader(reader);
                StringBuilder build = new StringBuilder();
                int c;
                while ((c = rr.read()) != -1) {
                    build.append((char) c);
                }
                System.out.println(" "+filename+" 파일을 읽은 결과 입니다.");
                System.out.println(build);
            }

            catch (IOException e) {

            }

        }

    }

    @SuppressWarnings("finally")
    static File createFile(String fileName) {

        try {

            System.out.println("파일 이름을 적어주세요.");
            fileName = scan.next();
            filename = fileName;
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {

            fileName = "제목없음.txt";		// fileName이 부적절한 경우, 파일 이름을 임의로 지정합니다.
        } finally {
            final File f = new File(fileName); // File클래스의 객체를 만듭니다.
            createNewFile(f); // 생성된 객체를 이용해서 파일을 생성한다.
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile(); // 파일을 생성합니다.
        } catch (Exception e) {
        }
    }

}