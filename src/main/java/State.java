public class State implements Comparable<State>{
    String name;
    String abbreviation;
    String capital;
    int population;

    public State(String name, String abbreviation, String capital, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
        this.population = population;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) Captial: %s, Population: %,d", name, abbreviation, capital, population);
    }

    public int compareTo(State o) {
        return name.compareToIgnoreCase(o.name);
    }
}
