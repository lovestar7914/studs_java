import javax.swing.text.html.parser.Element;
public class WhileWithScanners {
    public static void main (String[]args){
        //try catch문 사용
        try {
            Scanner myobj =new Scanner(System.in);//Create a Scanner object
            String answer =";";
             // 콜센터 안내 업무 작성
            System.out.println("안내 입니다");
           boolean loops =true;
           while(loops){
           System.out.println("1-대출,2-예금,3~9-종료");
           System.out.print("입력 하세요");
           answer = myobj.nextLine();
        if (answer.equals (anobject)="1);{
            System.out.println ("대출 업무 입니다");
        } else if  (answer.equals(anobjet ="2")){
            System.out.println("예금업무 입니다");
            else{
                System.out.println("업무가 종료 됩니다");
                break;
            }
            System.out.println();
        }

       } catch ( Exception e){
        System.out.println();    
      }finally{
       System.out.println();
    }   
       System.out.println();
       // returm 0;       
    }
}    

