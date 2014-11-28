package actors

import models.Recipe
import akka.actor._
import play.api.libs.json._

class RecipesActor extends Actor {
  
  def receive = {
    case ListRecipes() =>
      sender() ! Json.toJson(Recipe.list)
  }
  
  implicit val recipeWrites = new Writes[Recipe] {
    def writes(recipe: Recipe) = Json.obj(
          "id" -> recipe.id,
          "name" -> recipe.name,
          "category" -> recipe.category,
          "ingredients" -> recipe.ingredients,
          "directions" -> recipe.directions,
          "rating" -> recipe.rating,
          "imgUrl" -> recipe.imgUrl
        )
  }
}

case class ListRecipes()