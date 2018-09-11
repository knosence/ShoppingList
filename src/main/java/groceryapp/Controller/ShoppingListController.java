package groceryapp.Controller;

import groceryapp.models.ShoppingList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingListController {

    @RequestMapping("/shoppinglists")
    public ShoppingList getShoppingLists(){
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.setTitle("Walmart");
        return shoppingList;
    }

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

}
