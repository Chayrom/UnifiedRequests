package unifiedlRequests.limitation;

public class LimitationRule {

    private final long top;
    private final long offset;

    public LimitationRule(long top, long offset) {
        this.top = top;
        this.offset = offset;
    }

    public long getTop() {
        return top;
    }

    public long getOffset() {
        return offset;
    }

}
