package Arrays.problems;

public class LC2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i : operations){
            if(i.contains("++")){
                x+=1;
            }
            if(i.contains("--")){
               x-=1;
            }
//            if(i.charAt(1)==('+')){
//                x++;
//            }else{
//                x--;
//            }
        }
        return x ;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }
}
