package APCompSci.PracticeProblems.TwentyThree;

import java.util.List;

public class TwentyThree {
    public static List<String> animals;
    public static void main(String[] args) {
        animals.add("bear");
        animals.add("zebra");
        animals.add("bass");
        animals.add("cat");
        animals.add("koala");
        animals.add("baboon");
        manipulate();
        System.out.println(animals);
    }
        public static void manipulate(){
        for(int k = animals.size() - 1; k>0; k--){
            if(animals.get(k).substring(0,1).equals("b")){
                animals.add(animals.size()-k, animals.remove(k));
            }
        }
    }
}
