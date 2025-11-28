import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> s = new HashSet<>();
        for(String i:cards)
            {
                s.add(i);
            }
        return s;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.size() == 0 || theirCollection.size() == 0)return false;
        for(String i:myCollection)
            {
                for(String j:theirCollection)
                    {
                        if((!myCollection.contains(j)) && (!theirCollection.contains(i))){
                            return true;
                        }
                    }
            }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>();
        for(String i:collections.get(0))
            {

                        boolean flag = true;
                        for(Set<String> c:collections)
                            {
                                if(!c.contains(i))
                                {
                                    flag = false;
                                    break;
                                }
                            }
                        if(flag)
                            s.add(i);
                    
            }
        return s;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>();
        for(Set<String> l:collections)
            {
                for(String i : l)
                    {
                        s.add(i);
                    }
            }
        return s;
    }
}
