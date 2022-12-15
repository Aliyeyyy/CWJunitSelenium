package Day1_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {
    //1. test
    //2. test
    //3. test
    //4. test gelistirme asamasında olsun

    //Her testimizden once v sonra calısması gereken kod bloklarımız (methodlarımız) mevcut
    //Tum testlerin oncesinde ve sonrasında calısması gerekn methodlarımız mevcut

    //        1. @Test -> Marks a method as a TEST CASE.
    //        2. @Before : Runs before EACH @Test annotation.
   //        3. @After : Runs after EACH @Test annotation.
   //        4. @BeforeClass : Runs before each class only once.
   //        5. @AfterClass : Runs after each class only once.
   //        6. @Ignore : Skipping a test case.



    @Test
    public void test01(){
        System.out.println("1. test yapılıyor...");
    }

    @Test
    public void test02(){
        System.out.println("2. test yapılıyor...");
    }
    @Test
    public void test03(){
        System.out.println("3. test yapılıyor...");
    }

    @Test
    @Ignore
    public void test04(){
        System.out.println("4. test gelistirme asamasında ...");
    }

    @Before
    public void beforeEach (){
        System.out.println("Method oncesi kod blogu calıstı");
    }

    @After
    public void afterEach (){
        System.out.println("Method sonrası kod blogu calıstı");
    }

    @BeforeClass
    public static void beforeAll (){
        System.out.println("Methodların oncesindeki kod blogu calıstı");
    }

    @AfterClass
    public static void afterAll (){
        System.out.println("Methodların sonrasındakı kod blogu calıstı");
    }

}
