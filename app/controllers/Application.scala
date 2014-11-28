package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import models.Recipe
import models.Category

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  /*
  case class Recipe(id: String, name: String, category: String, 
    ingredients: List[String], directions: String, 
    rating: Int, imgUrl: String);
  */
  
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
  
  def listRecipes = Action {
    val json = Json.toJson(Recipe.list);
    Ok(json);
  }
  
  def listCategories = Action {
    val json = Json.toJson(Category.list);
    Ok(json);
  }
}