import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class DialingCodes {
    Map<Integer,String>map = new HashMap<>();
    public Map<Integer, String> getCodes() {
        
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code,country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        Collection<String> s = map.values();
        if(!s.contains(country) && !map.containsKey(code))
            map.put(code,country);
    }

    public Integer findDialingCode(String country) {
        Collection<String> s = map.values();
        
        for(Integer i:map.keySet())
        {
            if(map.get(i).equals(country))
                return i;
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Collection<String> s = map.values();
        if(s.contains(country))
        {
            map.remove(findDialingCode(country));
            map.put(code,country);
        }
    }
}
