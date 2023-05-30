public class MethodBasics {
    // <access_modifier><return_type> <method_name>()
    // {
    // //body
    // }
    // x에 +1
    public int F(int x) {
        int result = x + 1;
        return result;

    }

    public static void main(String[] args){
       try {
        int x = 4;
        int y = 0; 
        //y = x + 1; //변수에 +1
        //y = f(x);
        MethodBasics methodbasics = new MethodBasics();
        y = methodbasics.F(x);
       
        y = y +  1; // 변수에 +1
    }catch(Exception e){
    //TODO: handle exception
    }
     System.out.println();
      //return 0;
   }
}   