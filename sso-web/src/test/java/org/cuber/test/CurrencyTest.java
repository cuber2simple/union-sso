package org.cuber.test;

import org.cuber.SSOApplication;
import org.cuber.stub.basic.Currency;
import org.cuber.stub.util.CurrencyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SSOApplication.class)
public class CurrencyTest {

    @Test
    public void testCurrency() throws Exception {
        Currency currency = CurrencyUtils.findByAlphaCode("USD");
        Currency currency3 = CurrencyUtils.findByAlphaCode("USD");
        System.out.println(currency);
        System.out.println(currency3);
    }
}
