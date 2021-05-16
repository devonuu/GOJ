package e.eight;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OptionalTest {

    public void createOptionalObjects(){
        Optional<String> emptyString = Optional.empty();
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);
        String nonnull = "data";
        Optional<String> ofString = Optional.of(nonnull);
        System.out.println("nullableString has value = "+nullableString.isPresent());
        System.out.println("ofString has value = "+ofString.isPresent());
    }

    public void getOptionalData(Optional<String> data) throws Exception{
        String defaultValue = "default";
        //String result1 = data.get();
        //System.out.println(result1);
        String result2 = data.orElse(defaultValue);
        System.out.println(result2);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "godofjava";
            }
        };
        String result3 = data.orElseGet(stringSupplier);
        System.out.println(result3);
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception("커스텀 익셉션");
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);
        System.out.println(result4);
    }

    public void printDayOfWeek(){
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        for (DayOfWeek day : dayOfWeeks) {
            System.out.println(day.getDisplayName(TextStyle.FULL,locale));
            System.out.println(day.getDisplayName(TextStyle.SHORT,locale));
        }

        DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.getDefault());

    }

    public void printStringJoiner(){
        String[] stringArr = new String[]{"a","b","c","d"};
        StringBuilder sb = new StringBuilder();
        for(String str : stringArr){
            sb.append(str + ",");
        }
        sb.setCharAt(sb.lastIndexOf(","), ' ');
        System.out.println(sb.toString().trim());

        StringJoiner joiner = new StringJoiner(",");
        for (String str : stringArr){
            joiner.add(str);
        }
        System.out.println(joiner.toString());

        joiner = new StringJoiner(",","(",")");
        for (String str : stringArr){
            joiner.add(str);
        }
        System.out.println(joiner.toString());
    }

    public void withCollector(){
        String[] stringArr = new String[]{"a","b","c","d"};
        List<String> list = Arrays.asList(stringArr);
        String result = list.stream()
            .collect(Collectors.joining(",", "(", ")"));
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        OptionalTest optionalTest = new OptionalTest();
        optionalTest.createOptionalObjects();
        /*String data = null;
        try{
            optionalTest.getOptionalData(Optional.ofNullable(data));
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }*/
        //optionalTest.printDayOfWeek();
        //optionalTest.printStringJoiner();
        optionalTest.withCollector();
    }
}
