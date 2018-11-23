# XML with JSoup

This little project illustrates reading an XML file and putting the data into an ArrayList<E>.

## Data Source

This data was taken from https://github.com/CivilServiceUSA/us-states/blob/master/data/states.xml

Some changes were made to the file.

* The original file contains the \<state> tag at two different levels.  The second referred to the state name. 
 This second tag was changed to "stateName" in order to simplify parsing.
* I reordered the records a bit.  The list was in order by state name.  I wanted to demonstrate sorting, so I
did a minor shuffle of the state names as they originally appeared in the data.

## Overall

Frankly, this project is probably not the best example of anything.  Please feel free to add issues if you you have
suggestions for improvement.  Please keep in mind that the project is only here to give 
simple illustrations of XML and ArrayLists.

This demo doesn't really explore much about JSoup itself.  It is just included as a dependency in the pom.xml file.