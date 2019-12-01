package com.company;

public class Main {
   static int[] modules ={141589,93261,104320, 81961, 99212, 80661, 78734, 76783, 148694, 114382, 141508, 114659, 107687, 83845, 79690, 59366, 133984, 121431, 144033, 60628, 112095, 78560, 142103, 128943, 109209, 108999, 144208, 113134, 76591, 57098, 127233, 143194, 85736, 128733, 132275, 128871, 115164, 50617, 138648, 73023, 98822, 63572, 102841, 54817, 123579, 113025, 90063, 112330, 117131, 87661, 147299, 146812, 102343, 58763, 59569, 135997, 146057, 108574, 70215, 74304, 93988, 128150, 76391, 110718, 135513, 62057, 72921, 76889, 67794, 79041, 71987, 148584, 145472, 131139, 78569, 62584, 85610, 106800, 128550, 81694, 105892, 91250, 69465, 115222, 73511, 75887, 74891, 127555, 131553, 140892, 69685, 108927, 105759, 105884, 112178, 109708, 116894, 63459, 133853, 111303};
    
    public static void main(String[] args) {
        System.out.println("the sum of the fuel requirements for all of the modules on my spacecraft " + calculateFuel());
        System.out.println("sum of the fuel requirements for all of the modules on my spacecraft when also taking into account the mass of the added fuel is " + calculateFuelForAllModules());
    }

    private  static int calculateFuel(){
        int total=0;
        for (int m: modules) {
            total+=calculateFuelperModule(m);
        }
        return  total;
    }

    private  static int calculateFuelForAllModules(){
        int total=0;
        for (int m: modules) {
            while (true){
                m=calculateFuelperModule(m);
                if(m<0) break;
                total+=m;
            }
        }
        return  total;
    }

    private  static int calculateFuelperModule(int m){
        return  (int) Math.floor(m / 3) - 2;
    }


}
