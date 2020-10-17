package com.wsdaoy.bean;

import com.wsdaoy.service.Filter;

public class Receptionist implements Filter{
    private Filter filter;

    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void receptionUser(User user,String type){
        user.setType(type);
    }

    @Override
    public void filterUser(User u) {
        System.out.print(u.getId()+"-"+u.getType()+" ");
    }
}
