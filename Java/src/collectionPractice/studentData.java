package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class studentData {
    public static List<student> get(){

        return new ArrayList<>(Arrays.asList(
           new student("tom",2021,
                   new ArrayList<>(Arrays.asList(
                           new Project("hello world"),
                           new Project("dot world"),
                           new Project("Python world")
                   ))),
           new student("harry",2022,
                   new ArrayList<>(Arrays.asList(
                           new Project("hhhhhhhhhhhhh"),
                           new Project("ewrtgdbvc"),
                           new Project("wqertyguhjkl")
                   ))),

           new student("hitler",2021,
                   new ArrayList<>(Arrays.asList(
                           new Project("sdfghj"),
                           new Project("sdfghj"),
                           new Project("sdfghj")
                   )))
        ));

    }
}
