package utilities;

import org.testng.annotations.DataProvider;



//import utiities.utils.ExcelReader;

public class DataProviders {
    /*****************************
     * REGISTRATION DATA PROVIDERS
     ****************************/
    @DataProvider(name = "InvalidRegistrations")
    public static Object[][] getInvalidRegistrationData(){
        Object[][] data = ExcelReader.getData("registration");
        return data;
    }

    /***********************
     * LOGIN DATA PROVIDERS
     **********************/
    @DataProvider(name = "InvalidLogins")
    public static Object[][] getInvalidLogins(){
        Object[][] data = ExcelReader.getData("login");
        return data;
    }

    @DataProvider(name = "ExistingProducts")
    public static Object[][] getExistingProducts(){
        Object[][] data = ExcelReader.getData("products");
        return data;
    }
}
