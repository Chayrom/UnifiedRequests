package unifiedlRequests;


import unifiedlRequests.filter.FilteringRule;
import unifiedlRequests.limitation.LimitationRule;
import unifiedlRequests.sort.SortRule;


public class UnifiedRequest {

    private final LimitationRule limitationRule;

    private final SortRule sortRule;

    private final FilteringRule filteringRule;

    public UnifiedRequest(LimitationRule limitationRule, SortRule sortRule, FilteringRule filteringRule) {
        this.limitationRule = limitationRule;
        this.sortRule = sortRule;
        this.filteringRule = filteringRule;
    }

    public LimitationRule getLimitationRule() {
        return limitationRule;
    }

    public SortRule getSortRule() {
        return sortRule;
    }

    public FilteringRule getFilteringRule() {
        return filteringRule;
    }

}
