library recipe;

class Recipe {
  String id;
  String name;
  String category;
  List<String> ingredients;
  String directions;
  String imgUrl;
  int rating;

  Recipe(this.id, this.name, this.category, this.ingredients, this.directions, this.rating,
         this.imgUrl);
}