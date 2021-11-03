import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DemoQ3 
{  
    public static void main(String[] args) {
 
        List<String> plancolorgray = Arrays.asList("GRAY","bathroom", "floor", "tiles", "washbasin");
        List<String> plancolorblack = Arrays.asList("BLACK","Beds", "cabins", "kitchengranid");
        List<String> plancolorwhite = Arrays.asList("WHITE","housefloors", "kitchentiles", "washbasins");
        List<String> plancolorpink = Arrays.asList("PINK","walls", "kidswall", "mainhall");
        List<String> plancolorblue = Arrays.asList("BLUE","Boyswall", "Painting on wall");
 
        List<List<String>> housecolor = new ArrayList<List<String>>(); 
        housecolor.add(plancolorgray);
        housecolor.add(plancolorblack);
        housecolor.add(plancolorwhite);
        housecolor.add(plancolorpink);
        housecolor.add(plancolorblue);
 
        List<String> listOfcolors = new ArrayList<String>();
        for(List<String> colors : housecolor) {
            for(String Newcolor : colors) {
                listOfcolors.add(Newcolor);
            }
        }
 
        System.out.println("List of all the color choosen by family members");
        System.out.println(listOfcolors);
 
        System.out.println();

        List<String> flatMapList = housecolor.stream().flatMap(colorList -> colorList.stream()).collect(Collectors.toList()); 
        System.out.println("----------all color details----------------"); 
        System.out.println(flatMapList);        
    }
}
