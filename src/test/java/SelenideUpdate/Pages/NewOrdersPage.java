package SelenideUpdate.Pages;

public class NewOrdersPage extends  AbstractTestsPage {


    private String dateFrom = "input[ng-model=\"model.checkIn\"]";
    private String dateTo = "input[ng-model=\"model.checkOut\"]";
    private String car102 = "img[ng-src=\"https://s3.amazonaws.com/realcar-development/images/data/000/002/147/medium/891c2b946758b04ca5107066a9b89c01.png?1566402382\"]";
    private String hourUpAvailability = "div[ng-change=\"checkInTimeChanged();\"]>table>tbody>tr>td>a[ng-click=\"incrementHours()\"]";
    private String nextAvailabilityButton = "//availability-buttons[1]/div/div/div/div[3]/button";
    private String firstClient = "//*[@id=\"1575386958201-grid-container\"]/div[2]/div/div";
    private String secondSelect = "div[class=\"ui-grid-row ng-scope\"][ng-class=\"{'ui-grid-row-selected': row.isSelected}\"]:nth-child(2)";
    private String searchFeald = "input[ng-model=\"searchField\"]";
    private String clientsNextButton = "//client-buttons[1]/div/div/div/div[3]/button";
}
