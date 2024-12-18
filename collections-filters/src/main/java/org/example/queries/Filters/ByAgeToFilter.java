package org.example.queries.Filters;

import org.example.model.Person;
import org.example.queries.search.SearchParameters;

import java.util.List;

public class ByAgeToFilter implements IFilterPeople{
    SearchParameters searchParams;

    @Override
    public void setSearchParameters(SearchParameters searchParameters) {
        this.searchParams = searchParameters;


    }

    @Override
    public boolean canFilter() {
        return searchParams.getAgeTo()>0;
    }

    @Override
    public List<Person> filter(List<Person> items) {
        return items.stream().filter(p->p.getAge()<=searchParams.getAgeTo()).toList();
    }
}
