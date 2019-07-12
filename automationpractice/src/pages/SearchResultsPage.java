package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;

    By liSortBy = By.id("selectProductSort");
    By ulProductList = By.className("product_list");
    By itemTitles = By.cssSelector("a[class=product-name]");

    public List<String> getItemNames(){
        List<WebElement> strItemTitles = driver.findElement(ulProductList).findElements(itemTitles);
        List<String> titles = new ArrayList<>();

        for(WebElement title:strItemTitles){
            titles.add(title.getText());
        }

        return titles;
    }

    /**
     *
     * @param path - path to file where we want to save list of items
     */
    public void printListToFile(String path){
        Path file = Paths.get(path);
        try {
            Files.write(file, getItemNames(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
