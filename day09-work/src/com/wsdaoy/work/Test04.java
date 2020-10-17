package com.wsdaoy.work;

import com.wsdaoy.bean.OldPhone;
import com.wsdaoy.service.impl.NewPhone;

public class Test04 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        OldPhone op = new OldPhone();
        op.call();
        op.sendMessage();
        np.call();
        np.sendMessage();
        np.playGame();
    }
}
