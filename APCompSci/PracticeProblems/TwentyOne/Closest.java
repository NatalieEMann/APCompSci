package APCompSci.PracticeProblems.TwentyOne;

public class Closest {
    public static double findClosest(double[][] mat, double val){
        double answer = mat[0][0]; 
        double minDiff = Math.abs(answer-val);

        for(double[] row : mat){
            for(double num : row){
                if(Math.abs(num-val)<minDiff){
                    answer = num;
                    minDiff = Math.abs(num-val);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        double[][] test = {{5.5,7.2,1.0,0.5,2.1,5.7}, {5.6, 3.4, 2.3, 7.8}};
       double ans = findClosest(test, 3.9);
       System.out.println(ans);
    }
}
