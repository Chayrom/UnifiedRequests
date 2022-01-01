package unifiedlRequests.filter;

import java.util.ArrayList;

public class SingleFilteringRule implements FilteringRule {

    private ArrayList<String> fieldNames;//todo подумать, как сделать, чтобы вложенность было понятной
                                         //todo подумать, над обработкой ошибок в случае, когда лист вложенных филдов не
                                         //todo применим к классу объекта
    private FilteringOperation filteringOperation;
    private Object argument;//todo подумать над ясностью алгоритма проверки идентичности объектов;
                            //todo подумать на обработкой ошибок в случае, когда класс argument на совпадаетс с классом
                            //todo лежищим в fieldName;

}
