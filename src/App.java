import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        String[] holidaysDates = new String[] {"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"};
        String [] holidaysNames = new String[] {"Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Chisti", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal"};

        List<Holiday> holidaysList = new ArrayList<>();

        for(int i=0; i < holidaysDates.length; i++) {
            String date = holidaysDates[i];
            String name = holidaysNames[i];
            Holiday item = new Holiday(name, date);
            holidaysList.add(item);
        }
        System.out.println(holidaysList);
    }
}