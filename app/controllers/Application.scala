package controllers

import play.api.mvc._
import actors._
import akka.actor._
import akka.actor.ActorRef
import akka.actor.Props
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import scala.concurrent.duration._
import akka.pattern.ask
import play.api.libs.json.Json
import models.Category
import play.api.libs.json._
import akka.util.Timeout

object Application extends Controller {

  val system = ActorSystem("application")
  val recipesActor: ActorRef = system.actorOf(Props[RecipesActor])
  val categoriesActor: ActorRef = system.actorOf(Props[CategoriesActor])
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def listRecipes = Action.async {
    implicit val timeout = Timeout(3 seconds)
    (recipesActor ? ListRecipes() ).mapTo[JsValue].map { message =>
        Ok(message)      
    }
  }

  def listCategories = Action.async {
    implicit val timeout = Timeout(3 seconds)
    (categoriesActor ? ListCategories() ).mapTo[JsValue].map { message =>
        Ok(message)      
    }
  }
}