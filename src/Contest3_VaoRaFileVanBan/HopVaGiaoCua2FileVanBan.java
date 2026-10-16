package Contest3_VaoRaFileVanBan;

import java.io.*;
import java.util.*;
class WordSet {
    private TreeSet<String> set;
    public WordSet(String fileName) throws FileNotFoundException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
        sc.close();
    }
    public String union(WordSet other) {
        TreeSet<String> res = new TreeSet<>(this.set);
        res.addAll(other.set);
        return String.join(" ", res);
    }
    public String intersection(WordSet other) {
        TreeSet<String> res = new TreeSet<>();
        for (String word : this.set) {
            if (other.set.contains(word)) {
                res.add(word);
            }
        }
        return String.join(" ", res);
    }
}
public class HopVaGiaoCua2FileVanBan {
    public static void main(String[] args) throws Exception {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
