package fragment.bwie.com.unit01_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 毒瘾i on 2017/8/30.
 */
public class MainActivityTest {
    private MainActivity mainActivity;
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        mainActivity=new MainActivity();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void onCreate() throws Exception {

    }

    @Test
    public void addSum() throws Exception {
        System.out.println("addSum");
       assertEquals(8,mainActivity.addSum(2,3));
    }

}