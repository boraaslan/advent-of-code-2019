import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //REAL
    static String[] wire1={"R998","U502","R895","D288","R416","U107","R492","U303","R719","D601","R783","D154","L236","U913","R833","D329","R28","D759","L270","D549","L245","U653","L851","U676","L211","D949","R980","U314","L897","U764","R149","D214","L195","D907","R534","D446","R362","D6","L246","D851","L25","U925","L334","U673","L998","U581","R783","U912","R53","D694","L441","U411","L908","D756","R946","D522","L77","U468","R816","D555","L194","D707","R97","D622","R99","D265","L590","U573","R132","D183","L969","D207","L90","D331","R88","D606","L315","U343","R546","U460","L826","D427","L232","U117","R125","U309","R433","D53","R148","U116","L437","U339","L288","D879","L52","D630","R201","D517","L341","U178","R94","U636","L759","D598","L278","U332","R192","U463","L325","U850","L200","U810","L686","U249","L226","D297","R915","D117","R56","D59","R760","U445","R184","U918","R173","D903","R212","D868","L88","D798","L829","U835","L563","U19","R480","D989","R529","D834","R515","U964","L876","D294","R778","D551","L457","D458","R150","D698","R956","D781","L310","D948","R50","U56","R98","U348","L254","U614","L654","D359","R632","D994","L701","D615","R64","D507","R668","D583","L687","D902","L564","D214","R930","D331","L212","U943","R559","U886","R590","D805","R426","U669","L141","D233","L573","D682","L931","U267","R117","D900","L944","U667","L838","D374","L406","U856","R987","D870","R716","D593","R596","D654","R653","U120","L666","U145","R490","D629","R172","D881","L808","D324","R956","D532","L475","U165","L503","U361","R208","U323","R568","D876","R663","D11","L839","D67","R499","U75","L643","U954","R94","D418","R761","D842","L213","D616","L785","D42","R707","D343","L513","D480","L531","D890","L899","D2","L30","D188","R32","U588","R480","U33","R849","U443","L666","U117","L13","D974","L453","U93","R960","D369","R332","D61","L17","U557","R818","D744","L124","U916","L454","D572","R451","D29","R711","D134","R481","U366","L327","U132","L819","U839","R485","U941","R224","U531","R688","U561","R958","D899","L315","U824","L408","D941","R517","D163","L878","U28","R767","D798","R227"};
    static String[] wire2={"L1009","U399","R373","U980","L48","U638","R725","U775","R714","D530","L887","D576","L682","D940","L371","D621","L342","D482","R676","D445","R752","U119","L361","D444","L769","D854","L874","U259","R332","U218","R866","U28","L342","D233","L958","U649","R998","U262","L8","D863","L283","D449","L73","D438","L516","D54","R964","D981","R338","U332","L761","U704","L705","D468","L115","U834","R367","D156","R480","U27","R846","U73","R846","D720","R811","D466","L407","U928","R816","U50","R90","D893","L930","D833","L159","D972","L823","U868","R689","D558","L777","D13","R844","D8","L168","U956","L111","D462","L667","U559","L839","U503","R906","D838","R83","D323","L782","U588","R599","D233","L700","U679","L51","U779","L110","D260","L201","U992","L43","D557","L628","D875","L201","U535","L246","D976","L546","D22","R600","D301","L542","D41","R532","U316","L765","D310","L666","D369","R853","U684","L457","U816","L667","U758","R798","U959","R893","D185","L842","U168","R68","D348","R394","D296","R966","D511","L319","U717","L57","U129","R843","U439","L744","D870","L162","D991","R77","D565","R494","U601","L851","U748","L96","U124","L379","D446","L882","U371","R133","U820","L935","D704","L670","D911","L182","U138","R844","U926","L552","D716","L849","U624","R723","U117","R252","D737","L216","U796","R156","U322","R812","D390","L50","D493","L665","U314","L584","U798","L11","U524","R171","U837","R981","U32","L277","U650","L865","U28","R399","U908","R652","D543","L779","D406","L839","D198","L190","D319","L776","U752","R383","D884","R385","D682","R729","D163","R252","U533","L690","D767","R533","D147","R366","U716","R548","U171","R932","U720","L9","D39","R895","U850","L276","D988","L528","U551","L262","D480","L275","D567","R70","D599","L814","U876","R120","U93","L565","U795","L278","D41","R695","D693","R208","U272","L923","U498","R238","U268","L244","U278","R965","U395","R990","U329","L478","D245","R980","D473","L702","U396","R358","U636","R400","D919","R240","U780","L251","D633","L55","D723","L529","U319","L299","D89","L251","D557","L705","D705","L391","D58","R241"};


//TEST1
//   static String[] wire1={"R75","D30","R83","U83","L12","D49","R71","U7","L72"};
//    static String[] wire2={"U62","R66","U55","R34","D71","R55","D58","R83"};

//TEST2
//    static String[] wire1={"R98","U47","R26","D63","R33","U87","L62","D20","R33","U53","R51"};
//    static String[] wire2={"U98","R91","D20","R16","D67","R40","U7","R15","U6","R7"};


    public static void main(String[] args) {

        //w1 and w2 are used for coordinates of wire1 and wire2
        List<String> w1=GenerateCoordinates(wire1);  // x;y notation
        List<String> w2=GenerateCoordinates(wire2);

        List<String> intersections= w1.stream().filter(w2::contains).collect(Collectors.toList());

        System.out.println("All of the intersections are "+ intersections);
        System.out.println("The Manhattan distance from the central port to the closest intersection is " + closestIntersectionDistance(intersections));

        int fewestcombinedsteps=Integer.MAX_VALUE;
        for (String c: intersections) {
            int a=numberofStepstoReachIntersection(c,w1);
            int b=numberofStepstoReachIntersection(c,w2);
            if(a+b<fewestcombinedsteps)
                fewestcombinedsteps=a+b;
            System.out.println(c + "  " + a + "  " + b + " " + (a+b));
        }

        System.out.println("The fewest combined steps the wires must take to reach an intersection is " + fewestcombinedsteps );
    }

    private static int numberofStepstoReachIntersection(String intersection, List<String> coordinates ){
        int steps= coordinates.indexOf(intersection)+1;
        return steps;
    }
    private  static int closestIntersectionDistance(List<String> intersections){
        int md=Integer.MAX_VALUE;// md for manhattan distance
        for (String inters: intersections){
            String[] interCoordinates = inters.split(";");
            int mdi=Math.abs(Integer.parseInt(interCoordinates[0]))+Math.abs(Integer.parseInt(interCoordinates[1]));
            if(mdi<md)
                md=mdi;
        }
        return md;
    }
    private static  List<String> GenerateCoordinates(String[] wire){
        int x=0,y=0;
        ArrayList<String> coordinates=new ArrayList<String>();
        for (int i=0;i<wire.length;i++){
            if(wire[i].startsWith("R")){
                for(int j=0;j<Integer.parseInt(wire[i].substring(1));j++){
                    x++;
                    coordinates.add(x+";"+ y);
                }
            }
            else if(wire[i].startsWith("L")){
                for(int j=0;j<Integer.parseInt(wire[i].substring(1));j++){
                    x--;
                    coordinates.add(x+";"+ y);
                }
            }
            else if(wire[i].startsWith("U")){
                for(int j=0;j<Integer.parseInt(wire[i].substring(1));j++){
                    y++;
                    coordinates.add(x+";"+ y);
                }
            }
            else if(wire[i].startsWith("D")){
                for(int j=0;j<Integer.parseInt(wire[i].substring(1));j++){
                    y--;
                    coordinates.add(x+";"+ y);
                }
            }
        }

        return coordinates;
    }
}
