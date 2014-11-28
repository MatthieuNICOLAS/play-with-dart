package actors

import akka.actor.Actor
import play.api.libs.json.Json
import models.Category

class CategoriesActor extends Actor {
  
  def receive = {
    case ListCategories() =>
      sender() ! Json.toJson(Category.list)
  }
}

case class ListCategories()