//基本練習
//実行時に数字を2つ入力し、和を返す
public class t2 {

    public static void main(String[] args) {
        if (args.length == 2) {
            try{
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);

                String message = Integer.toString(arg1 + arg2);
                
                System.out.println(message);

            }catch(Exception e){
                System.out.println("入力例：<1>_<2>");
            }
        }else{
            System.out.println("引数が足りません");
        }
    }
    
}
