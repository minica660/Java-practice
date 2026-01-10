import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class copy {
    public static void main(String[] args) {
        FileInputStream fileinst = null;
        FileOutputStream fileoutst = null;
        try{

            //streamopen
            fileinst = new FileInputStream(args[0]);
            fileoutst = new FileOutputStream(args[1]);
            int data;

            //読み書き
            while ((data = fileinst.read()) != -1) {

                fileoutst.write(data);
               
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
                System.out.println("エラー");
                e.printStackTrace();
        }finally{
            try{

            //streamclose
            if (fileinst != null) {
                
            fileinst.close();

            }
            if (fileoutst != null) {
                
            fileoutst.close();

            }

            }catch(IOException e){
                e.printStackTrace();
            }catch(Exception e){
                System.out.println("エラー");
                e.printStackTrace();
            }
        }
    }
}
