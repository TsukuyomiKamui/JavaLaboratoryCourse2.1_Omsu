public interface Filter {
    boolean apply(String str);
}

 class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}

 class EndStringFilter implements Filter{
    private final String pattern;

    public EndStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }
}

 class ContainsStringFilter implements Filter{
    private final String pattern;

    public ContainsStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.contains(pattern);
    }
}

