package Entertainment;


public class Park {
    public void attractionsInPark(Attraction[] array) {
        System.out.println(" В парке работают следующие аттракционы: ");
        for (Attraction listOfAttractions : array) {
            System.out.println(listOfAttractions.getAttractionName());
        }
    }
    public void attractionsInfo(Attraction[] array) {
        System.out.println("\nПодробная информация о каждом аттракционе: ");
        for (Attraction listOfAttractions : array) {
            System.out.println(listOfAttractions.toString());
        }
}

    public class Attraction {
        private final String nameAttraction;
        private final String hourseWorking;
        private final int priceAttraction;

        public String getAttractionName() {
            return nameAttraction;
        }
    public Attraction(String name, String workingHours, int price) {
        this.nameAttraction = name;
        this.hourseWorking = workingHours;
        this.priceAttraction = price;
    } @Override
    public String toString() {
        return nameAttraction +
                "\n- Время работы:" + hourseWorking +
                "\n- Стоимость одного использования: " + priceAttraction + ".";
        }
    }
}