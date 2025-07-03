package programs;

public class JumpingStatements_06 {
    public static void main(String[] args) {
//        BreakExample.breakStatement();
//        ContinueExample.continueStatement();
        return; // Exits the main method
        // System.out.println("This not executed...");  // This will cause an error
    }

    class BreakExample{
        static void breakStatement(){
            for(int i=0; i<10; i++){
                if(i==7){
                    break; // breaking the code flow
                }
                System.out.println("The Code is Executing...." + i);
            }
        }
    }

    class ContinueExample{
        static void continueStatement(){
            for(int i=0; i<10; i++){
                if(i==7){
                    continue; // skip the code flow 
                }
                System.out.println("The Code is Executing...." + i);
            }
        }
    }
    
}
