library recipe_book_component;

import 'package:angular/angular.dart';
import 'package:play_with_dart/tooltip/tooltip.dart' show TooltipModel;
import 'package:play_with_dart/recipe.dart';

/* The selector field defines the CSS selector that will trigger the component. It can be any valid
 * CSS selector which does not cross element boundaries.
 *
 * The component's public fields are available for data binding from the view.
 * Similarly, the component's public methods can be invoked from the view.
 */
@Component(
    selector: 'recipe-book',
    templateUrl: 'recipe_book.html')
class RecipeBookComponent {
  Recipe selectedRecipe;
  List<Recipe> recipes;

  // Filter box
  final categoryFilterMap = <String, bool>{
    'Appetizers': false,
    'Salads': false,
    'Soups': false,
    'Main Dishes': false,
    'Side Dishes': false,
    'Desserts': false
  };
  Iterable<String> get categories => categoryFilterMap.keys;
  
  
  String nameFilterString = "";
  
  RecipeBookComponent() {
    recipes = _loadData();
  }

  void selectRecipe(Recipe recipe) {
    selectedRecipe = recipe;
  }

  // Tooltip
  static final tooltip = new Expando<TooltipModel>();
  
  TooltipModel tooltipForRecipe(Recipe recipe) {
   if (tooltip[recipe] == null) {
     tooltip[recipe] = new TooltipModel(recipe.imgUrl,
         "I don't have a picture of these recipes, "
         "so here's one of my cat instead!",
         80);
   }
   return tooltip[recipe]; // recipe.tooltip
  }
  
  void clearFilters() {
    categoryFilterMap.clear();
    nameFilterString = "";
  }
  
  List<Recipe> _loadData() {
    return [
      new Recipe('1', 'My Appetizer','Appetizers',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 1, "/assets/images/fonzie1.jpg"),
      new Recipe('2', 'My Salad','Salads',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 3, "/assets/images/fonzie2.jpg"),
      new Recipe('3', 'My Soup','Soups',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 4, "/assets/images/fonzie1.jpg"),
      new Recipe('4', 'My Main Dish','Main Dishes',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 2, "/assets/images/fonzie2.jpg"),
      new Recipe('5', 'My Side Dish','Side Dishes',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 3, "/assets/images/fonzie1.jpg"),
      new Recipe('6', 'My Awesome Dessert','Desserts',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 5, "/assets/images/fonzie2.jpg"),
      new Recipe('7', 'My So-So Dessert','Desserts',
          ["Ingredient 1", "Ingredient 2"],
          "Some Directions", 3, "/assets/images/fonzie1.jpg"),
    ];
  }
}