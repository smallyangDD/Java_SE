package com.wsdaoy.service.impl;

import com.wsdaoy.service.MatchStr;

import java.util.Scanner;

public class ResultMsg implements MatchStr {
    @Override
    public boolean matchString(String str,String m) {

        return str.equals(m);
    }
}
