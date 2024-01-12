public class IndexofFirstOccurance {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        IndexofFirstOccurance obj = new IndexofFirstOccurance();
        System.out.println(obj.strStr("hello", "ll"));
    }
}
