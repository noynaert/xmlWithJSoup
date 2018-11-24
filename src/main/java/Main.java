import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /*
      Data is adapted from:
      https://github.com/CivilServiceUSA/us-states/tree/master/data

      The following changes were made.
         * <state> appeared at two different levels.  In order to simplify the extraction, I changed the inner <state>
           tag to <stateName>
         * The states appeared in alphabetic order.  I wanted to demonstrate sorting, so I suffled the list a little
           so it did not appear to be sorted in the original data.
    */
    public static void main(String[] args) {

        ArrayList<State> list = readStates();

        System.out.println("Original List: ");
        print(list);

        System.out.println("\nSorted List:");
        Collections.sort(list);
        print(list);

        System.out.println("Done.");
    }

    public static ArrayList<State> readStates() {
        ArrayList<State> stateList = new ArrayList<>(50);

        try {
            Document doc = Jsoup.parse(new File("stateData.xml"), "UTF-8");


            //Pull out the states
            Element root = doc.getElementsByTag("states").first();

            Elements states = root.children();
            System.out.println("Count: " + states.size());

            //Now process each state
            for (Element state : states) {
                //extract each of the fields from the xml file for one state
                String stateName = state.getElementsByTag("stateName").first().text();
                String capital = state.getElementsByTag("capital_city").first().text();
                String abbreviation = state.getElementsByTag("code").first().text();
                int population = Integer.parseInt(state.getElementsByTag("population").first().text());

                //create one instance of the state and add it to the ArrayList
                State item = new State(stateName, abbreviation, capital, population);
                stateList.add(item);
                //System.out.println(item);
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Could not open input file");
            System.exit(1);
        }

        //Just in case there are more the arraylist is the wrong size, let's save some memory
        if(stateList != null)
            stateList.trimToSize();
        
        return stateList;
    }

    public static <E> void print(ArrayList<E> list){
        System.out.println(list.size() + " items ----------------------------");
        for(E e : list){
            System.out.println(e);
        }
    }


}
