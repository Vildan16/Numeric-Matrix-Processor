class Util {
    public static int indexOf(String src, String tgt) {
        if (src.contains(tgt))
            return src.indexOf(tgt);
        return -1;
    }
}