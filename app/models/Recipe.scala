package models

import controllers.Assets.Asset

/**
 * @author matthieu
 */
case class Recipe(id: String, name: String, category: String, 
    ingredients: List[String], directions: String, 
    rating: Int, imgUrl: String);

object Recipe {
  var list: List[Recipe] = {
    List(
        Recipe(
          "1", "Bleu Cheese Stuffed Mushrooms", "Appetizers",
          List(
              "12 mushrooms",
              "8 oz bleu cheese",
              "1/2 red onion, diced",
              "1/4 cup bread crumbs",
              "1/4 cup parmesan cheese"
          ),
          "Preheat oven to 250 degrees F. Clean the mushrooms. Break the stems off, chop and set aside. Combine bleu cheese, red onions, bread crumbs and chopped mushroom stems. Fill each mushroom with the bleu cheese mixture and place on a baking sheet. Bake for 20 minutes, or until the tops are golden. Sprinkle with parmesan cheese if desired.",
          1,
          "assets/images/fonzie1.jpg"
        ),
        Recipe(
          "2", "Cannelini Bean and Mushroom Salad", "Salads",
          List(
              "2 cups cannelini",
              "a large handful of mushrooms, sliced",
              "3 tbsp italian parsley",
              "2 tbsp fresh thyme",
              "3 tbsp fresh chives",
              "a handful of cherry tomatoes, halved",
              "slices of parmesan cheese",
              "lemon juice",
              "olive oil",
              "1 garlic clove",
              "salt"
          ),
          "Cook and drain the beans. Coat mushrooms with olive oil and grill or pan fry them. Combine the beans, mushrooms, herbs and tomatoes. Combine lemon juice, olive oil, garlic and salt and make an emulsion. Pour the dressing over the bean mixture and stir to combine. Use a carrot peeler to peel some parmesan cheese over the top.",
          3,
          "assets/images/fonzie2.jpg"
        ),
        Recipe(
          "3", "Pumpkin Black Bean Soup", "Soups",
          List(
              "2 tablespoon extra-virgin olive oil",
              "1 medium onion, finely chopped",
              "3 cups canned or packaged vegetable stock, found on soup aisle",
              "1 can (14 1/2 ounces) diced tomatoes in juice",
              "1 can (15 ounces) black beans, drained",
              "2 cans (15 ounces) pumpkin puree",
              "1 cup heavy cream",
              "1 tablespoon curry powder",
              "1 1/2 teaspoons ground cumin",
              "1/2 teaspoon cayenne pepper",
              "Coarse salt",
              "20 blades fresh chives, chopped or snipped, for garnish"
          ),
          "Add oil to a soup pot on medium heat. When oil is hot, add onion. Saute onions 5 minutes. Add broth, tomatoes, black beans and pumpkin puree. Stir to combine ingredients and bring soup to a boil. Reduce heat to medium low and stir in cream, curry, cumin, cayenne and salt, to taste. Simmer 5 minutes, adjust seasonings and serve garnished with chopped chives.",
          3,
          "assets/images/fonzie1.jpg"
        ),
        Recipe(
          "4", "Smoked Salmon Pasta", "Main Dishes",
          List(
              "8 ounces spaghetti (or other) pasta",
              "1/4 cup pine nuts",
              "2 Tbsp olive oil",
              "1/3 cup chopped shallots (can substitute onions)",
              "2 cloves garlic, minced",
              "1/3 cup dry white wine",
              "1/4 cup cream",
              "2 Tbsp lemon zest",
              "1 Tbsp lemon juice",
              "2 Tbsp chopped fresh parsley or dill",
              "4 ounces smoked salmon, cut into bite sized pieces",
              "pinch salt",
              "Fresh ground black pepper"
          ),
          "Bring a pot of water to a boil over high heat to cook the pasta. Meanwhile, toast the pine nuts in a dry pan or toaster oven and set aside. Add olive oil to a sauce pan on medium heat. Add shallots and cook for 5 minutes until soft and just beginning to caramelize. Add garlic and cook until garlic is soft, but not brown. Add wine and reduce. Turn heat to low and add cream (heat needs to be low, or the cream will curdle). When the pasta is finished cooking, drain it and add to the sauce pan. Turn the heat off and stir to combine. Add lemon juice, parsley or dill, pine nuts, and salmon. Add salt and pepper to taste.",
          2,
          "assets/images/fonzie2.jpg"
        ),
        Recipe(
          "5", "Pancetta Brussels Sprouts", "Side Dishes",
          List(
              "1 lb brussels sprouts",
              "1 tbsp olive oil",
              "1 tbsp butter",
              "1/4 cup pancetta, chopped",
              "splash of balsamic vinegar"
          ),
          "Wash brussels sprouts, and chop in half. In a pan over medium heat, melt the oil and butter. Add sprouts and pancetta and turn heat to high. Cook until the sprouts are caramelized. Deglaze the pan with a splash of balsamic vinegar.",
          3,
          "assets/images/fonzie1.jpg"
        ),
        Recipe(
          "6", "Almond Cookies With Chai Spices", "Desserts",
          List(
              "1/2 cup unsalted butter, room temperature",
              "1 1/3 cups powdered sugar, divided",
              "2 tsp vanilla extract",
              "1 tsp almond extract",
              "3/4 tsp ground allspice",
              "3/4 tsp ground cardamom",
              "1/2 tsp ground cinnamon",
              "1/4 tsp salt",
              "1 cup all purpose flour",
              "3/4 cup finely chopped toasted almonds"
          ),
          "Preheat oven to 350 degrees F. Using electric mixer, beat butter, 1/3 cup sugar, both extracts, spices, and salt in medium bowl.  Beat in flour, then stir in almonds.  Using hands, roll dough into tablespoon-size balls.  Place on large baking sheet, spacing apart.  Bake until pale golden, about 25 minutes.  Cool on sheet 5 minutes.  Place remaining sugar in large bowl.  Working in batches, gently coat hot cookies in sugar.  Cool cookies on rack.  Roll again in sugar and serve. ",
          5,
          "assets/images/fonzie2.jpg"
        ),
        Recipe(
          "7", "Cardamom Poached Pears", "Desserts",
          List(
              "2 pears, peeled",
              "1 1/4 cups water",
              "1/2 cup sugar",
              "3 2 inch strips of lemon zest",
              "1 cracked whole cardamom",
              "A couple grinds of fresh shaved nutmeg",
              "vanilla"
          ),
          "Combine all ingredients except the pears in a sauce pan and simmer for 10 minutes. Add the pears to the pan and cook, turning the pears occasionally so that all sides cook evenly. Cook for about 10 minutes, or until pears are soft enough to be poked with a fork.",
          3,
          "assets/images/fonzie1.jpg"
        )
    )
  }
}