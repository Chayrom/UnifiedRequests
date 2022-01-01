package unifiedlRequests.filter;

import java.util.List;

public class CompositeFilteringRule implements FilteringRule {

    private List<FilteringRule> filteringRules;
    private Boolean isOrOperations;

}
