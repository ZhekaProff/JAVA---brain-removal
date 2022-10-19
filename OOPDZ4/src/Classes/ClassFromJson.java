package Classes;

import java.util.HashMap;
import java.util.Map;

public class ClassFromJson {
    private String line;
    public ClassFromJson(String line) {
        this.line = line;
    }

    public MyObject create(){
        this.line = line.substring(1, line.length()-1);
        String[] pairs = line.split(",");
        Map<String, String> fieldsAndValues = new HashMap<>();

        for(String pair: pairs){
            String[] tmp = pair.split(":");
            fieldsAndValues.put(tmp[0].substring(1,tmp[0].length()-1),tmp[1]);
        }

        return new MyObject(fieldsAndValues.get("name"),
                Integer.parseInt(fieldsAndValues.get("height")),
                Integer.parseInt(fieldsAndValues.get("weight")));
    }

}
