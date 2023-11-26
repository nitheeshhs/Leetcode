/*

    We can follow a back tracking approach here, We can start from step 5 the umber of steps needed will be 1
    i.e possibilities , also lets consider we are in step 4 , the number of steps posssible is 1.

    from the above two statements we can frame a base condition, p(3) will be 1 + p(4) [1 + 1]
    p(2) will be p(3)+p(4). [1+2] = 3
    p(1) will be p(2)+p(3) [3+2] = 5
    p(0) will be p(1)+p(2) [3+5] =8

    5 = 221, 212, 122, 1112, 1121, 1211, 2111, 11111

 */


public class NSteps {
    /*
        @param n : total steps to be covered
        @return ptr : which will have the total possible ways in which the steps can be covered.
    */
    public static  int calcPossibilities(int n){
        int ptr1 = 1;
        int ptr2 = 1;
        int temp = 0;

        for(int i = 0 ; i < n-1; i++){
            temp = ptr1;
            ptr1 = ptr1 + ptr2;
            ptr2 = temp;
            sddkkd

        }

        return ptr1;
    }
    public static void main(String[] args) {
        int numberOfSteps = 5;
        System.out.println("Number of possibilities : " + calcPossibilities(numberOfSteps));
    }
}
